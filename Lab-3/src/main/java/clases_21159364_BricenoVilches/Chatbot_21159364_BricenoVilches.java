package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.ChatbotInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Clase de un Chatbot que implementa la interfaz de Chatbot.
 * Implementación de ChatbotInterfaz_21159364_BricenoVilches
 * Agregación de Flow_21159364_BricenoVilches
 */
public class Chatbot_21159364_BricenoVilches implements ChatbotInterfaz_21159364_BricenoVilches {
    private int chatbotId;
    private String name;
    private String welcomeMessage;
    private int startFlowId;
    private List<Flow_21159364_BricenoVilches> flows;


    /**
     * <p> Constructor que crea una instancia de Chatbot_21159364_BricenoVilches vacio
     * </p>
     * @param null
     * @return Chatbot_21159364_BricenoVilches
     */
    public Chatbot_21159364_BricenoVilches() {
        this.chatbotId = 0;
        this.name = "";
        this.welcomeMessage = "";
        this.startFlowId = 1;
        this.flows = new ArrayList<>();
    }

    /**
     * <p> RF 4: Constructor que crea una instancia de Chatbot_21159364_BricenoVilches, Sobrecarga
     * </p>
     * @param chatbotId (int) id del chatbot
     * @param name (String) nombre del chatbot
     * @param welcomeMessage (String) mensaje del chatbot
     * @param startFlowId (int) id flow inicial
     * @param flows (List) lista de flows
     * @return Chatbot_21159364_BricenoVilches
     */
    public Chatbot_21159364_BricenoVilches(int chatbotId, String name, String welcomeMessage, int startFlowId, List<Flow_21159364_BricenoVilches> flows) {
        this.chatbotId = chatbotId;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowId = startFlowId;
        this.flows = flows;
        System.out.println("Chatbot creado exitosamente.");
    }

    /**
     * <p> Getter de chatbotId
     * </p>
     * @param null
     * @return Chatbotid (int)
     */
    public int getChatbotId() {
        return chatbotId;
    }
    /**
     * <p> Getter de name
     * </p>
     * @param null
     * @return name (String)
     */
    public String getName() {
        return name;
    }

    /**
     * <p> Getter de startFlowId
     * </p>
     * @param null
     * @return startFlowId (int)
     */
    public int getStartFlowId() {
        return startFlowId;
    }

    /**
     * <p> Setter de startFlowId
     * </p>
     * @param startFlowId (int)
     * @return void
     */
    public void setStartFlowId(int startFlowId) {
        this.startFlowId = startFlowId;
    }
    /**
     * <p> Getter de flows
     * </p>
     * @param null
     * @return flows (list) lista de flujos
     */
    public List<Flow_21159364_BricenoVilches> getFlows() {
        return flows;
    }

    /** Otro
     * <p> Permite crear un chatbot dandole sus atributos por consola primero y despues llamando al constructor
     * </p>
     * @param input A traves de consola
     * @param flowsDisponibles lista de flujos disponibles a agregar al chatbot
     * @return Chatbot_21159364_BricenoVilches
     */
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
        System.out.println("Elija el numero del flujo a agregar (presione 0 para salir):");
        int flowChoice;
        do {
            System.out.println("Numero de flow:");
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
                System.out.println("Numero de flujo invalido. Intentelo de nuevo.");
            }
        } while (flowChoice != 0);
        return new Chatbot_21159364_BricenoVilches(id, name, welcomeMessage,startFlowId,flows);
    }

    /** Modificador
     * <p> RF 5: Añade un flujo dado al Chatbot, revisando si no esta duplicado
     * </p>
     * @param flow (Flow_21159364_BricenoVilches)
     * @return void
     */
    public void chatbotAddFlow(Flow_21159364_BricenoVilches flow){
        if (!flowDuplicado(getFlows(), flow.getId())) {
            this.flows.add(flow);
            System.out.println("Flujo añadido a chatbot exitosamente.");
            System.out.println("Chatbot modificado:" + this);
        } else {
            System.out.println("Id flujo duplicado");
        }
    }
    /** Pertenencia
     * <p> Permite revisar si una id de un flujo ya se encuentra en una lista de flujos
     * </p>
     * @param flows lista de flujos a revisar
     * @param  id (int) a revisar si se encuentra en la lista
     * @return True si esta duplicado, False si no lo esta
     */
    public boolean flowDuplicado(List<Flow_21159364_BricenoVilches> flows, int id){
        for(Flow_21159364_BricenoVilches flow : flows){
            if (flow.getId() == id){
                return true;
            }
        }
        return false;
    }
    /** Otro
     * <p> Muestra por consola todos los chatbots de una lista
     * </p>
     * @param chatbots lista de chatbots a mostrar
     * @return void
     */
    public void mostrarChatbots(List<Chatbot_21159364_BricenoVilches> chatbots){
        int i = 1;
        for (Chatbot_21159364_BricenoVilches chatbot : chatbots){
            System.out.println((i++) + ". " +chatbot);
        }
    }

    /** Otro
     * <p> Escribe una instancia de chatbot como String si es pedido
     * </p>
     * @param null
     * @return String
     */
    public String toString(){
        return "Chatbot(" + chatbotId + "," + name +"," + welcomeMessage + "," + startFlowId +"," + flows+")";
    }

    /** Selector
     * <p> Retorna el flow inicial del chatbot
     * </p>
     * @param null
     * @return flow (Flow_21159364_BricenoVilches) o null si no lo encuentra
     */
    public Flow_21159364_BricenoVilches encontrarFlowInicial(){
        for (Flow_21159364_BricenoVilches flow : getFlows()) {
            if (flow.getId() == getStartFlowId()) {
                return flow;
            }
        }
        System.out.println("Flow Inicial no encontrado");
        return null;
    }
}
