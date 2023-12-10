package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.SystemInterfaz_21159364_BricenoVilches;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static clases_21159364_BricenoVilches.Usuarios_21159364_BricenoVilches.findUser;
/**
 * Clase de un sistema que implementa la interfaz de System.
 * Implementación de SystemInterfaz_21159364_BricenoVilches
 * Agregación de Usuarios_21159364_BricenoVilches
 * Agregación de Chatbot_21159364_BricenoVilches
 */
public class System_21159364_BricenoVilches implements SystemInterfaz_21159364_BricenoVilches {
    private String name;
    private int initialChatbotCodeLink;
    private final LocalDateTime fechaCreacion;
    private List<Usuarios_21159364_BricenoVilches> users;
    private Usuarios_21159364_BricenoVilches userLogged;
    private List<Chatbot_21159364_BricenoVilches> chatbots;

    /**
     * <p> Constructor que crea una instancia de System_21159364_BricenoVilches vacio
     * </p>
     * @param null
     * @return System_21159364_BricenoVilches
     */
    public System_21159364_BricenoVilches(){
        this.name = "systemPrueba";
        this.initialChatbotCodeLink = 0;
        this.fechaCreacion = LocalDateTime.now();
        this.users = new ArrayList<>();
        this.userLogged = null;
        this.chatbots = new ArrayList<>();
    }
    /**
     * <p> RF 7: Constructor que crea una instancia de System_21159364_BricenoVilches, Sobrecarga
     * </p>
     * @param name (String) nombre del sistema
     * @param initialChatbotCodeLink Id del chatbot inicial
     * @param chatbots (List) lista de chatbots, Agregación
     * @return System_21159364_BricenoVilches
     */
    public System_21159364_BricenoVilches(String name, int initialChatbotCodeLink, List<Chatbot_21159364_BricenoVilches> chatbots){
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.fechaCreacion = LocalDateTime.now();
        this.users = new ArrayList<>();
        this.userLogged = null;
        this.chatbots = chatbots;
        System.out.println("System creado exitosamente.");
    }
    /**
     * <p> Getter de initialChatbotCodeLink
     * </p>
     * @param null
     * @return initialChatbotCodeLink (int)
     */
    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }

    /**
     * <p> Setter de initialChatbotCodeLink
     * </p>
     * @param initialChatbotCodeLink valor int a cambiar
     * @return void
     */
    public void setInitialChatbotCodeLink(int initialChatbotCodeLink) {
        this.initialChatbotCodeLink = initialChatbotCodeLink;
    }

    /**
     * <p> Getter de users
     * </p>
     * @param null
     * @return users (List) lista de usuarios
     */
    public List<Usuarios_21159364_BricenoVilches> getUsers() {
        return users;
    }

    /**
     * <p> Setter de users
     * </p>
     * @param users Lista de usuarios que se usará para actualizar
     * @return void
     */
    public void setUsers(List<Usuarios_21159364_BricenoVilches> users) {
        this.users = users;
    }

    /**
     * <p> Getter de usuario logeado
     * </p>
     * @param null
     * @return userLogged (Usuarios_21159364_BricenoVilches) usuario logeado
     */
    public Usuarios_21159364_BricenoVilches getUserLogged() {
        return userLogged;
    }
    /**
     * <p> Getter de chatbots
     * </p>
     * @param null
     * @return chatbots (List) lista de chatbots
     */
    public List<Chatbot_21159364_BricenoVilches> getChatbots() {
        return chatbots;
    }

    /**
     * <p> Permite crear un sistema dandole sus atributos por consola primero y despues llamando al constructor
     * </p>
     * @param input A traves de consola
     * @param chatbotsDisponibles lista de chatbots disponibles a agregar al sistema
     * @return System_21159364_BricenoVilches
     */
    public System_21159364_BricenoVilches crearSystemConsola(Scanner input, List<Chatbot_21159364_BricenoVilches> chatbotsDisponibles) {
        System.out.println("Ingrese el nombre del sistema:");
        String name = input.nextLine();
        System.out.println("Ingrese el initialChatbotCodeLink: ");
        int initialChatbotCodeLink = input.nextInt();
        input.nextLine();
        List<Chatbot_21159364_BricenoVilches> chatbots = new ArrayList<>();
        System.out.println("Chatbots disponibles:");
        Chatbot_21159364_BricenoVilches chatbotInstance = new Chatbot_21159364_BricenoVilches();
        chatbotInstance.mostrarChatbots(chatbotsDisponibles);
        System.out.println("Elija el numero del chatbot a agregar (presione 0 para salir):");
        int chatbotChoice;
        do {
            System.out.println("Numero de chatbot:");
            chatbotChoice = input.nextInt();
            input.nextLine();

            if (chatbotChoice > 0 && chatbotChoice <= chatbotsDisponibles.size()) {
                Chatbot_21159364_BricenoVilches chatbotElegido = chatbotsDisponibles.get(chatbotChoice -1);
                if (!chatbotDuplicado(chatbots, chatbotElegido.getChatbotId())) {
                    chatbots.add(chatbotElegido);
                } else {
                    System.out.println("La Id de este chatbot se encuentra repetido en el sistema");
                }
            } else if (chatbotChoice != 0) {
                System.out.println("Numero de chatbot invalido. Intentelo de nuevo.");
            }
        } while (chatbotChoice != 0);

        return new System_21159364_BricenoVilches(name, initialChatbotCodeLink, chatbots);
    }
    /**
     * <p> Permite revisar si una id de un chatbot ya se encuentra en una lista de chatbots
     * </p>
     * @param chatbots lista de chatbots a revisar
     * @param  id (int) a revisar si se encuentra en la lista
     * @return True si esta duplicado, False si no lo esta
     */
    public boolean chatbotDuplicado(List<Chatbot_21159364_BricenoVilches> chatbots, int id){
        for(Chatbot_21159364_BricenoVilches chatbot : chatbots){
            if (chatbot.getChatbotId() == id){
                return true;
            }
        }
        return false;
    }

    /**
     * <p> Permite revisar si un userName de un usuario ya se encuentra en una lista de usuarios
     * </p>
     * @param users lista de users a revisar
     * @param userName (String) a revisar si se encuentra en la lista
     * @return True si esta duplicado, False si no lo esta
     */
    public boolean userDuplicado(List<Usuarios_21159364_BricenoVilches> users, String userName){
        for(Usuarios_21159364_BricenoVilches user : users){
            if (user.getUserName().equalsIgnoreCase(userName)){
                return true;
            }
        }
        return false;
    }

    /**
     * <p> Muestra por consola todos los sistemas de una lista
     * </p>
     * @param systems lista de systems a mostrar
     * @return void
     */
    public void mostrarSystems(List<System_21159364_BricenoVilches> systems){
        int i = 1;
        for (System_21159364_BricenoVilches system : systems){
            System.out.println((i++) + ". " +system);
        }
    }

    /**
     * <p> Escribe una instancia de sistema como String si es pedido
     * </p>
     * @param null
     * @return String
     */
    public String toString(){
        return "System(" + name +"," + initialChatbotCodeLink + ","+ fechaCreacion +"," + users + "," + userLogged + "," + chatbots +")\n";
    }

    /**
     * <p> RF 8: Añade un chatbot dado al sistema, revisando si no esta duplicado
     * </p>
     * @param chatbot (Chatbot_21159364_BricenoVilches)
     * @return void
     */
    public void systemAddChatbot(Chatbot_21159364_BricenoVilches chatbot){
        if (!chatbotDuplicado(getChatbots(), chatbot.getChatbotId())) {
            this.chatbots.add(chatbot);
            System.out.println("Chatbot añadido al sistema");
        } else {
            System.out.println("Id chatbot duplicado");
        }
    }

    /**
     * <p> RF 9: Añade un user dado al sistema, revisando si no esta duplicado
     * </p>
     * @param user (Usuarios_21159364_BricenoVilches)
     * @return void
     */
    public void systemAddUser(Usuarios_21159364_BricenoVilches user){
        if (!userDuplicado(getUsers(), user.getUserName())){
            this.users.add(user);
            System.out.println("Usuario añadido al sistema");
        } else {
            System.out.println("User ya existe en el sistema");
        }
    }

    /**
     * <p> RF 10: Logea un usuario al sistema desde un userName
     * </p>
     * @param userName (String)
     * @return void
     */
    public void systemLogin(String userName){
        if (getUserLogged() == null){
            Usuarios_21159364_BricenoVilches user = findUser(getUsers(),userName);
            if (user != null){
            this.userLogged = user;
            System.out.println("Usuario logeado al sistema");
            }
        } else {
            System.out.println("User ya existe en el sistema");
        }
    }

    /**
     * <p> RF 11: Si hay un usuario logeado lo deslogea del sistema
     * </p>
     * @param null
     * @return void
     */
    public void systemLogout(){
        if (getUserLogged() != null){
            System.out.println("Usuario deslogeado del sistema: "+ userLogged);
            this.userLogged = null;
        }
    }

    /**
     * <p> Elimina a un usuario dado un nombre dentro de la lista de usuarios del sistema
     * </p>
     * @param userName (String)
     * @return void
     */
    public void eliminarUser(String userName) {
        for (Usuarios_21159364_BricenoVilches user : users) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                users.remove(user);
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }

    /**
     * <p> RF 12: Método que permite interactuar con un chatbot, solo funciona si hay un usuario logeado
     * </p>
     * @param mensaje (String) usado para hablar con el chatbot, puede ser la opción o palabra clave
     * @return void
     */
    public void systemTalk(String mensaje){
        getUserLogged().setChatHistory((getUserLogged().getChatHistory()) + "\n[" + LocalDateTime.now() +"] "+ getUserLogged().getUserName() + ": " + mensaje + "\n");
        Usuarios_21159364_BricenoVilches user = findUser(getUsers(), getUserLogged().getUserName());
        user.setChatHistory(user.getChatHistory()+ "\n[" + LocalDateTime.now() +"] "+ getUserLogged().getUserName() + ": " + mensaje + "\n");
        eliminarUser(user.getUserName());
        users.add(user);
        systemChatHistory();
        List<Option_21159364_BricenoVilches> opciones = encontrarChatbotInicial().encontrarFlowInicial().getOptions();
        for (Option_21159364_BricenoVilches option : opciones){
            if (mensaje.equals(Integer.toString(option.getId()))){
                setInitialChatbotCodeLink(option.getChatbotCodeLink());
                encontrarChatbotInicial().setStartFlowId(option.getInitialFlowCodeLink()); //Muy importante el orden de estas 2 lineas
                return;
            } else {
                for (String keyword : option.getKeywords()){
                    if (mensaje.equalsIgnoreCase(keyword)){
                        setInitialChatbotCodeLink(option.getChatbotCodeLink());
                        encontrarChatbotInicial().setStartFlowId(option.getInitialFlowCodeLink());
                        return;
                    }
                }
            }
        }
        System.out.println("No se encontro opcion.");
    }

    /**
     * <p> Retorna el chatbot inicial del sistema
     * </p>
     * @param null
     * @return chatbot (Chatbot_21159364_BricenoVilches) o null si no lo encuentra
     */
    public Chatbot_21159364_BricenoVilches encontrarChatbotInicial(){
        for (Chatbot_21159364_BricenoVilches chatbot : getChatbots()) {
            if (chatbot.getChatbotId() == getInitialChatbotCodeLink()) {
                return chatbot;
            }
        }
        System.out.println("Chatbot inicial no encontrado");
        return null;

    }

    /**
     * <p> RF 13:  Método que ofrece una síntesis del chatbot para un usuario particular  a partir de chatHistory contenido dentro del sistema
     * </p>
     * @param userName (String) el nombre del usuario del cual mostrara la sintesis
     * @return void
     */
    public void systemSynthesis(String userName){
        if (userLogged.getUserName().equalsIgnoreCase(userName)){
            if (userLogged.getChatHistory() != "") {
                System.out.println(userLogged.getChatHistory());
            } else {
                System.out.println("Historial Vacio");
            }
        } else if (findUser(users, userName) != null) {
            Usuarios_21159364_BricenoVilches user = findUser(users, userName);
            if (user.getChatHistory() != "") {
                System.out.println(user.getChatHistory());
            } else {
                System.out.println("Historial Vacio");
            }
        }
    }

    /**
     * <p> Llamado por systemTalk, actualiza el chatHistory del user del cual esta hablando con un chatbot
     * </p>
     * @param null
     * @return void
     */
    public void systemChatHistory(){
        getUserLogged().setChatHistory((getUserLogged().getChatHistory()) + encontrarChatbotInicial().getName() + ": " + encontrarChatbotInicial().encontrarFlowInicial().getName()+ "\n");
        Usuarios_21159364_BricenoVilches user = findUser(getUsers(), getUserLogged().getUserName());
        user.setChatHistory(user.getChatHistory() + encontrarChatbotInicial().getName() + ": " + encontrarChatbotInicial().encontrarFlowInicial().getName()+ "\n");
        for (Option_21159364_BricenoVilches option : encontrarChatbotInicial().encontrarFlowInicial().getOptions()) {
            getUserLogged().setChatHistory((getUserLogged().getChatHistory()) + option.getId() + ". " + option.getMessage() + "\n");
            user.setChatHistory(user.getChatHistory() + option.getId() + ". " + option.getMessage() + "\n");
        }
        eliminarUser(user.getUserName());
        users.add(user);
    }

    /**
     * <p> RF 14: Permite simular un diálogo entre dos chatbots del sistema.
     * </p>
     * @param maxInteractions (int) cantidad de interacciones de la simulacion
     * @param seed (int) creará la simulacion aleatoria
     * @param system (System_21159364_BricenoVilches) sistema usado para simular
     * @return void
     */
    public void systemSimulate(int maxInteractions, int seed, System_21159364_BricenoVilches system){
        if (maxInteractions >= 0 && seed >= 0) {
            while (maxInteractions > 0) {
                if (seed < 0) {
                    seed = -seed;
                }
                String seedString = Integer.toString(seed);
                char digito = seedString.charAt(0);
                String mensaje = Character.toString(digito);
                if (Integer.parseInt(mensaje) <= system.encontrarChatbotInicial().encontrarFlowInicial().getOptions().size()) {
                    system.systemTalk(mensaje);
                    maxInteractions--;
                }
                seed = new Random(seed).nextInt();
            }
            System.out.println("Simulacion terminada");
            return;
        } else {
            System.out.println("Parametros erroneos");
        }
    }
    /**public void systemSimulate(int maxInteractions, int seed, System_21159364_BricenoVilches system){
        if (maxInteractions > 0 && seed >= 0) {
            String seedString = Integer.toString(seed);
            char digito = seedString.charAt(0);
            String mensaje = Character.toString(digito);
            system.systemTalk(mensaje);
            seed = new Random(seed).nextInt();
            systemSimulate(maxInteractions--, seed, system);
        }
    }*/
}