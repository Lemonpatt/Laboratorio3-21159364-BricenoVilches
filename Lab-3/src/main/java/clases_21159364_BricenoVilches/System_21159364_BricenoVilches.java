package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.SystemInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class System_21159364_BricenoVilches implements SystemInterfaz_21159364_BricenoVilches {
    private String name;
    private int initialChatbotCodeLink;
    private List<Usuarios_21159364_BricenoVilches> users;
    private Usuarios_21159364_BricenoVilches userLogged;
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
        System.out.println("System creado exitosamente.");
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

    public List<Usuarios_21159364_BricenoVilches> getUsers() {
        return users;
    }

    public void setUsers(List<Usuarios_21159364_BricenoVilches> users) {
        this.users = users;
    }

    public Usuarios_21159364_BricenoVilches getUserLogged() {
        return userLogged;
    }

    public void setUserLogged(Usuarios_21159364_BricenoVilches userLogged) {
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
    private boolean userDuplicado(List<Usuarios_21159364_BricenoVilches> users, String userName){
        for(Usuarios_21159364_BricenoVilches user : users){
            if (user.getUserName().equalsIgnoreCase(userName)){
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
    public void systemAddChatbot(Chatbot_21159364_BricenoVilches chatbot){
        if (!chatbotDuplicado(getChatbots(), chatbot.getChatbotId())) {
            this.chatbots.add(chatbot);
            System.out.println("Chatbot añadido al sistema");
        } else {
            System.out.println("Id chatbot duplicado");
        }
    }
    public void systemAddUser(Usuarios_21159364_BricenoVilches user){
        if (!userDuplicado(getUsers(), user.getUserName())){
            this.users.add(user);
            System.out.println("Usuario añadido al sistema");
        } else {
            System.out.println("User ya existe en el sistema");
        }
    }
    public void systemLogin(String userName){
        if (getUserLogged() == null){
            this.userLogged = Usuarios_21159364_BricenoVilches.findUser(getUsers(),userName);
            if (userLogged != null) {
                System.out.println("Usuario logeado al sistema");
            }
        } else {
            System.out.println("User ya existe en el sistema");
        }
    }
    public void systemLogout(){
        if (getUserLogged() != null){
            String chathistoryNuevo = this.userLogged.getChatHistory();
            Usuarios_21159364_BricenoVilches user = Usuarios_21159364_BricenoVilches.findUser(getUsers(),this.userLogged.getUserName());
            this.users.remove(user);
            user.setChatHistory(chathistoryNuevo);
            eliminarUser(user.getUserName());
            users.add(user);
            this.userLogged = null;
            System.out.println("Usuario deslogeado del sistema: "+ user);
        }
    }
    public void eliminarUser(String userName) {
        for (Usuarios_21159364_BricenoVilches user : users) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                users.remove(user);
                System.out.println("Usuario eliminado");
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }
}
