package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.ChatbotInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chatbot_21159364_BricenoVilches implements ChatbotInterfaz_21159364_BricenoVilches {
    private int chatbotId;
    private String name;
    private String welcomeMessage;
    private int startFlowId;
    private List<Flow_21159364_BricenoVilches> flows;

    public Chatbot_21159364_BricenoVilches() {
        this.chatbotId = 0;
        this.name = "";
        this.welcomeMessage = "";
        this.startFlowId = 1;
        this.flows = new ArrayList<>();
    }
    public Chatbot_21159364_BricenoVilches(int chatbotId, String name, String welcomeMessage, int startFlowId, List<Flow_21159364_BricenoVilches> flows) {
        this.chatbotId = chatbotId;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowId = startFlowId;
        this.flows = flows;
        System.out.println("Chatbot creado exitosamente.");
    }

    public int getChatbotId() {
        return chatbotId;
    }

    public void setChatbotId(int chatbotId) {
        this.chatbotId = chatbotId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public int getStartFlowId() {
        return startFlowId;
    }

    public void setStartFlowId(int startFlowId) {
        this.startFlowId = startFlowId;
    }

    public List<Flow_21159364_BricenoVilches> getFlows() {
        return flows;
    }

    public void setFlows(List<Flow_21159364_BricenoVilches> flows) {
        this.flows = flows;
    }
    public Chatbot_21159364_BricenoVilches crearChatbotConsola(Scanner input, List<Flow_21159364_BricenoVilches> flowsDisponibles) {
        System.out.println("Ingrese el ID:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el nombre del Chatbot:");
        String name = input.nextLine();
        System.out.println("Ingrese el mensaje del Chatbot:");
        String welcomeMessage = input.nextLine();
        System.out.println("Ingrese el StartFlowId del Chatbot:");
        int startFlowId = input.nextInt();
        input.nextLine();
        List<Flow_21159364_BricenoVilches> flows = new ArrayList<>();
        System.out.println("Flujos disponibles:");
        Flow_21159364_BricenoVilches flowInstance = new Flow_21159364_BricenoVilches();
        flowInstance.mostrarFlows(flowsDisponibles);
        System.out.println("Elija el número del flujo a agregar (presione 0 para salir):");
        int flowChoice;
        do {
            System.out.println("Número de flow:");
            flowChoice = input.nextInt();
            input.nextLine(); // Consume the newline

            if (flowChoice > 0 && flowChoice <= flowsDisponibles.size()) {
                Flow_21159364_BricenoVilches flowElegido = flowsDisponibles.get(flowChoice -1);
                if (!flowDuplicado(flows, flowElegido.getId())) {
                    flows.add(flowElegido);
                } else {
                    System.out.println("La Id de este flujo se encuentra repetida en el Chatbot");
                }
            } else if (flowChoice != 0) {
                System.out.println("Número de flujo inválido. Inténtelo de nuevo.");
            }
        } while (flowChoice != 0);
        return new Chatbot_21159364_BricenoVilches(id, name, welcomeMessage,startFlowId,flows);
    }
    public void chatbotAddFlow(Flow_21159364_BricenoVilches flow){
        if (!flowDuplicado(getFlows(), flow.getId())) {
            this.flows.add(flow);
            System.out.println("Flujo añadido a chatbot exitosamente.");
        } else {
            System.out.println("Id flujo duplicado");
        }
    }
    private boolean flowDuplicado(List<Flow_21159364_BricenoVilches> flows, int id){
        for(Flow_21159364_BricenoVilches flow : flows){
            if (flow.getId() == id){
                return true;
            }
        }
        return false;
    }

    public void mostrarChatbots(List<Chatbot_21159364_BricenoVilches> chatbots){
        int i = 1;
        for (Chatbot_21159364_BricenoVilches chatbot : chatbots){
            System.out.println((i++) + ". " +chatbot);
        }
    }
    public String toString(){
        return "Chatbot(" + chatbotId + "," + name +"," + welcomeMessage + "," + startFlowId +"," + flows+")";
    }
}
