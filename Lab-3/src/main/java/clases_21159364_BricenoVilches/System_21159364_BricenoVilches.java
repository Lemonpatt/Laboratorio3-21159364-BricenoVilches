package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.SystemInterfaz_21159364_BricenoVilches;
import interfaces_21159364_BricenoVilches.UsuariosInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class System_21159364_BricenoVilches implements SystemInterfaz_21159364_BricenoVilches {
    private String name;
    private int initialChatbotCodeLink;
    private List<UsuariosInterfaz_21159364_BricenoVilches> users;
    private UsuariosInterfaz_21159364_BricenoVilches userLogged;
    private List<Chatbot_21159364_BricenoVilches> chatbots;

    public System_21159364_BricenoVilches(){
        this.name = "";
        this.initialChatbotCodeLink = 0;
        this.users = new ArrayList<>();
        this.userLogged = null;
        this.chatbots = new ArrayList<>();
    }
    public System_21159364_BricenoVilches(String name, int initialChatbotCodeLink, List<Chatbot_21159364_BricenoVilches> chatbots){
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.users = new ArrayList<>();
        this.userLogged = null;
        this.chatbots = chatbots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }

    public void setInitialChatbotCodeLink(int initialChatbotCodeLink) {
        this.initialChatbotCodeLink = initialChatbotCodeLink;
    }

    public List<UsuariosInterfaz_21159364_BricenoVilches> getUsers() {
        return users;
    }

    public void setUsers(List<UsuariosInterfaz_21159364_BricenoVilches> users) {
        this.users = users;
    }

    public UsuariosInterfaz_21159364_BricenoVilches getUserLogged() {
        return userLogged;
    }

    public void setUserLogged(UsuariosInterfaz_21159364_BricenoVilches userLogged) {
        this.userLogged = userLogged;
    }

    public List<Chatbot_21159364_BricenoVilches> getChatbots() {
        return chatbots;
    }

    public void setChatbots(List<Chatbot_21159364_BricenoVilches> chatbots) {
        this.chatbots = chatbots;
    }
    public System_21159364_BricenoVilches crearSystemConsola(Scanner input, List<Chatbot_21159364_BricenoVilches> chatbotsDisponibles) {
        System.out.println("Ingrese el nombre del sistema:");
        String name = input.nextLine();
        System.out.println("Ingrese el initialChatbotCodeLink");
        int initialChatbotCodeLink = input.nextInt();
        input.nextLine();
        List<Chatbot_21159364_BricenoVilches> chatbots = new ArrayList<>();
        System.out.println("chatbots disponibles:");
        Chatbot_21159364_BricenoVilches chatbotInstance = new Chatbot_21159364_BricenoVilches();
        chatbotInstance.mostrarChatbots(chatbotsDisponibles);
        System.out.println("Elija el número del chatbot a agregar (presione 0 para salir):");
        int chatbotChoice;
        do {
            System.out.println("Número de chatbot:");
            chatbotChoice = input.nextInt();
            input.nextLine(); // Consume the newline

            if (chatbotChoice > 0 && chatbotChoice <= chatbotsDisponibles.size()) {
                Chatbot_21159364_BricenoVilches chatbotElegido = chatbotsDisponibles.get(chatbotChoice -1);
                if (!chatbotDuplicado(chatbots, chatbotElegido.getChatbotId())) {
                    chatbots.add(chatbotElegido);
                } else {
                    System.out.println("La Id de este chatbot se encuentra repetido en el sistema");
                }
            } else if (chatbotChoice != 0) {
                System.out.println("Número de chatbot inválido. Inténtelo de nuevo.");
            }
        } while (chatbotChoice != 0);

        return new System_21159364_BricenoVilches(name, initialChatbotCodeLink, chatbots);
    }
    private boolean chatbotDuplicado(List<Chatbot_21159364_BricenoVilches> chatbots, int id){
        for(Chatbot_21159364_BricenoVilches chatbot : chatbots){
            if (chatbot.getChatbotId() == id){
                return true;
            }
        }
        return false;
    }
    public void mostrarSystems(List<System_21159364_BricenoVilches> systems){
        int i = 1;
        for (System_21159364_BricenoVilches system : systems){
            System.out.println((i++) + ". " +system);
        }
    }
    public String toString(){
        return "System(" + name +"," + initialChatbotCodeLink + "," + users + "," + userLogged + "," + chatbots +")";
    }
}
