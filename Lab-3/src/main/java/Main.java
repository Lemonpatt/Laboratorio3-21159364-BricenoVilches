import clases_21159364_BricenoVilches.*;

import java.util.*;

/**
 * Clase de Main que funciona para mostrar el menú y guardar los diferentes objetos creados.
 * Agregación de System_21159364_BricenoVilches
 * Agregación de Chatbot_21159364_BricenoVilches
 * Agregación de Flow_21159364_BricenoVilches
 * Agregación de Option_21159364_BricenoVilches
 */
public class Main {
    List<Option_21159364_BricenoVilches> options = new ArrayList<>();
    List<Flow_21159364_BricenoVilches> flows = new ArrayList<>();
    List<Chatbot_21159364_BricenoVilches> chatbots = new ArrayList<>();
    List<System_21159364_BricenoVilches> systems = new ArrayList<>();

    /**
     * La entrada principal del programa
     * <p>
     * Este metodo crea una instancia de la clase Main y ejecuta su metodo run
     * </p>
     * @param args Las lineas de argumentos dadas al programa (no usadas en esta implementacion).
     * @return void
     */
    public static void main(String[] args){
        Main mainInstance = new Main();
        mainInstance.run();
    }
    /**
     * Ejecuta el inicio del programa, inicializando los objetos presentes en el programa y interacuando con el usuario.
     * <p>
     * Este método configura instancias de varias clases, incluyendo opciones, flujos, chatbots y sistemas,
     * y luego procede a interactuar con el usuario a través de un sistema basado en menús. Se pide al usuario que elija
     * un sistema, y se muestra el menú correspondiente. Si el usuario elige un sistema entonces es enviado al metodo de menu inicial.
     * </p>
     * @return void
     */
    public void run() {
        Option_21159364_BricenoVilches op1 = new Option_21159364_BricenoVilches(1, "Viajar", 2, 1, Arrays.asList("viajar", "turistear", "conocer"));
        Option_21159364_BricenoVilches op2 = new Option_21159364_BricenoVilches(2, "Estudiar", 3, 1, Arrays.asList("estudiar", "aprender"));
        Flow_21159364_BricenoVilches f1 = new Flow_21159364_BricenoVilches(1, "Flujo Principal Chatbot 1\nBienvenido\n¿Que te gustaria hacer?", new ArrayList<>(Arrays.asList(op1, op2)));
        Chatbot_21159364_BricenoVilches cb1 = new Chatbot_21159364_BricenoVilches(1, "Inicial", "Que quieres hacer?", 1, new ArrayList<>(Arrays.asList(f1)));
        Option_21159364_BricenoVilches op3 = new Option_21159364_BricenoVilches(1, "New York, USA", 2, 2, Arrays.asList("USA", "Estados unidos", "New York", "NY"));
        Option_21159364_BricenoVilches op4 = new Option_21159364_BricenoVilches(2, "Paris, Francia", 2, 1, Arrays.asList("Paris", "Paris", "Francia"));
        Option_21159364_BricenoVilches op5 = new Option_21159364_BricenoVilches(3, "Torres del Paine, Chile", 2, 1, Arrays.asList("Chile", "Torres", "Torres del Paine", "Paine"));
        Option_21159364_BricenoVilches op6 = new Option_21159364_BricenoVilches(4, "Volver", 1, 1, Arrays.asList("Regresar", "Volver"));
        Option_21159364_BricenoVilches op7 = new Option_21159364_BricenoVilches(1, "Central Park", 2, 2, Arrays.asList("Central", "Park", "Central Park"));
        Option_21159364_BricenoVilches op8 = new Option_21159364_BricenoVilches(2, "Museos", 2, 2, Arrays.asList("Museos"));
        Option_21159364_BricenoVilches op9 = new Option_21159364_BricenoVilches(3, "Ningun otro atractivo", 2, 3,new ArrayList<>(Arrays.asList()));
        Option_21159364_BricenoVilches op10 = new Option_21159364_BricenoVilches(4, "Cambiar destino", 2, 1, Arrays.asList("Cambiar", "Salir", "Volver"));
        Option_21159364_BricenoVilches op11 = new Option_21159364_BricenoVilches(1, "Solo", 2, 3, Arrays.asList("Solo"));
        Option_21159364_BricenoVilches op12 = new Option_21159364_BricenoVilches(2, "En pareja", 2, 3, Arrays.asList("Pareja", "En pareja"));
        Option_21159364_BricenoVilches op13 = new Option_21159364_BricenoVilches(3, "En familia", 2,3, Arrays.asList("Familia", "En familia"));
        Option_21159364_BricenoVilches op14 = new Option_21159364_BricenoVilches(4, "Agregar mas atractivos", 2, 2, Arrays.asList("Agregar", "Atractivos"));
        Option_21159364_BricenoVilches op15 = new Option_21159364_BricenoVilches(5, "En realidad quiero otro destino", 2, 1, Arrays.asList("Cambiar", "Otro"));
        Flow_21159364_BricenoVilches f20 = new Flow_21159364_BricenoVilches(1, "Flujo 1 Chatbot2\n¿Donde te Gustaria ir?", new ArrayList<>(Arrays.asList(op3,op4,op5,op6)));
        Flow_21159364_BricenoVilches f21 = new Flow_21159364_BricenoVilches(2, "Flujo 2 Chatbot2\n¿Que atractivos te gustaria visitar?", new ArrayList<>(Arrays.asList(op7,op8,op9,op10)));
        Flow_21159364_BricenoVilches f22 = new Flow_21159364_BricenoVilches(3, "Flujo 3 Chatbot2\n¿Vas solo o acompañado?", new ArrayList<>(Arrays.asList(op11,op12,op13,op14,op15)));
        Chatbot_21159364_BricenoVilches cb2 = new Chatbot_21159364_BricenoVilches(2, "Agencia Viajes", "Bienvenido\n ¿Donde quieres viajar?", 1, new ArrayList<>(Arrays.asList(f20, f21, f22)));
        Option_21159364_BricenoVilches op16 = new Option_21159364_BricenoVilches(1, "Carrera Tecnica", 3, 1, Arrays.asList("Tecnica", "Carrera"));
        Option_21159364_BricenoVilches op17 = new Option_21159364_BricenoVilches(2, "Postgrado", 3, 1, Arrays.asList("Doctorado", "Postgrado", "Magister"));
        Option_21159364_BricenoVilches op18 = new Option_21159364_BricenoVilches(3, "Volver", 1,1, Arrays.asList("Volver", "Regresar"));
        Flow_21159364_BricenoVilches f3 = new Flow_21159364_BricenoVilches(1, "Flujo 1 Chatbot3\n¿Que te gustaria estudiar?", new ArrayList<>(Arrays.asList(op16,op17,op18)));
        Chatbot_21159364_BricenoVilches cb3 = new Chatbot_21159364_BricenoVilches(3, "Orientador Academico", "Bienvenido\n¿Que te gustaria estudiar?", 1, new ArrayList<>(Arrays.asList(f3)));
        System_21159364_BricenoVilches s1 = new System_21159364_BricenoVilches("System principal", 1, new ArrayList<>(Arrays.asList(cb1, cb2, cb3)));
        UserAdmin_21159364_BricenoVilches admin = new UserAdmin_21159364_BricenoVilches("Admin");
        User_21159364_BricenoVilches user1 = new User_21159364_BricenoVilches("User1");
        System_21159364_BricenoVilches s_vacio = new System_21159364_BricenoVilches();
        options.add(op1);
        options.add(op2);
        options.add(op3);
        options.add(op4);
        options.add(op5);
        options.add(op6);
        options.add(op7);
        options.add(op8);
        options.add(op9);
        options.add(op10);
        options.add(op11);
        options.add(op12);
        options.add(op13);
        options.add(op14);
        options.add(op15);
        options.add(op16);
        options.add(op17);
        options.add(op18);
        flows.add(f1);
        flows.add(f20);
        flows.add(f21);
        flows.add(f22);
        flows.add(f3);
        chatbots.add(cb1);
        chatbots.add(cb2);
        chatbots.add(cb3);
        systems.add(s1);
        systems.add(s_vacio);
        s1.systemAddUser(admin);
        s1.systemAddUser(user1);
        Scanner input = new Scanner(System.in);
        System.out.println("####### Instancia menu empezada ########");
        System.out.println("Bienvenido, elija el sistema a usar: \n");
        System_21159364_BricenoVilches systemInstance = new System_21159364_BricenoVilches();
        systemInstance.mostrarSystems(systems);
        System.out.println("Elija numero de sistema:");
        int systemChoice = input.nextInt();
        input.nextLine();
        if (systemChoice > 0 && systemChoice <= systems.size()) {
            System.out.println("Sistema elegido: "+ systems.get(systemChoice - 1));
        } else {System.out.println("Opcion invalida.");}
        System_21159364_BricenoVilches systemAbierto = systems.get(systemChoice - 1);
        menuInicial(systemAbierto);
    }
    /**
     * Ejecuta el menu principal en donde se debera logear al sistema o registrar para poder usar.
     * <p>
     * Al logearse a un sistema mediante este metodo se redirige a distintos menus dependiendo de que tipo de usuario se acaba de logear.
     * </p>
     * @param systemAbierto (System_21159364_BricenoVilches) sistema elegido anteriormente
     * @return void
     */
    private void menuInicial(System_21159364_BricenoVilches systemAbierto){
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 3;
        int choice;
        System.out.println("Para usar el sistema debe logarse");
        do {
            System.out.println("1- Logear usuario");
            System.out.println("2- Registrar usuario");
            System.out.println("3- Salir");
            System.out.println("Escriba el numero de la opcion a elegir: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Lista de usuarios:" + systemAbierto.getUsers());
                    System.out.println("Introduzca el nombre de usuario: ");
                    String userName = input.nextLine();
                    systemAbierto.systemLogin(userName);
                    if (systemAbierto.getUserLogged() != null) {
                        if (systemAbierto.getUserLogged().isAdmin()) {
                            menuAdmin(systemAbierto);
                        } else if (!systemAbierto.getUserLogged().isAdmin()) {
                            menuUser(systemAbierto);
                        }
                    }
                    break;
                case 2:
                    System.out.println("1- Registrar usuario normal");
                    System.out.println("2- Registrar usuario administrador ");
                    System.out.println("Escriba el numero de la opcion a elegir:");
                    int choiceRegister = input.nextInt();
                    input.nextLine();
                    if (choiceRegister == 1){
                        System.out.println("Introduzca el nombre de usuario a crear: ");
                        User_21159364_BricenoVilches userCreado = new User_21159364_BricenoVilches(input.nextLine());
                        systemAbierto.systemAddUser(userCreado);

                    } else if (choiceRegister == 2) {
                        System.out.println("Introduzca el nombre de usuario a crear: ");
                        UserAdmin_21159364_BricenoVilches userCreado = new UserAdmin_21159364_BricenoVilches(input.nextLine());
                        systemAbierto.systemAddUser(userCreado);
                    } else {
                        System.out.println("Eleccion invalida.");
                    }
                    break;
                case 3:
                    System.out.println("Cerrando sesion...");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " No es una opcion valida.");
            }

        }while (choice != MENU_EXIT_OPTION);
    }
    /**
     * Ejecuta el menu de un usuario admin en donde se puede interactuar de todas las formas con el sistema y hacer cualquier tipo de modificacion a la instancia del programa.
     * @param systemAbierto (System_21159364_BricenoVilches)
     * @return void
     */
    private void menuAdmin(System_21159364_BricenoVilches systemAbierto) {
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 16;

        int choice;
        do{
            System.out.println("Main Menu\n");
            System.out.print("1. Crear Opcion \n");
            System.out.print("2. Mostrar opciones.\n");
            System.out.print("3. Crear Flujo.\n");
            System.out.print("4. Añadir opcion a flujo.\n");
            System.out.print("5. Mostrar flujos.\n");
            System.out.print("6. Crear Chatbot.\n");
            System.out.print("7. Añadir flujo a Chatbot.\n");
            System.out.print("8. Mostrar Chatbots\n");
            System.out.print("9. Crear sistema\n");
            System.out.println("10. Cambiar sistema");
            System.out.print("11. Añadir chatbot a sistema\n");
            System.out.print("12. Mostrar Sistemas\n");
            System.out.print("13. Hablar con chatbot \n");
            System.out.print("14. Sintesis de historial de usuario.\n");
            System.out.print("15. Emular conversacion.\n");
            System.out.print("16. Deslogearse\n");
            System.out.print("\nIntroduzca una opcion: ");
            choice = input.nextInt();
            input.nextLine();
                switch (choice) {

                    case 1:
                        Option_21159364_BricenoVilches optionInstance = new Option_21159364_BricenoVilches().crearOpcionConsola(input);
                        options.add(optionInstance);
                        System.out.println("Opcion creada:" + optionInstance);
                        break;
                    case 2:
                        if (!options.isEmpty()) {
                            optionInstance = new Option_21159364_BricenoVilches();
                            optionInstance.mostrarOpciones(options);
                        } else {
                            System.out.println("No hay opciones en el sistema");
                        }
                        break;
                    case 3:
                        Flow_21159364_BricenoVilches flowInstance = new Flow_21159364_BricenoVilches().crearFlowConsola(input, options);
                        flows.add(flowInstance);
                        System.out.println("Flujo creado:" + flowInstance);
                        break;

                    case 4:
                        if (!flows.isEmpty()) {
                            flowInstance = new Flow_21159364_BricenoVilches();
                            flowInstance.mostrarFlows(flows);
                            System.out.println("Elige un flow al cual añadirle una opcion");
                            int flowChoice;
                            System.out.println("Numero de flow a añadirle una opcion:");
                            flowChoice = input.nextInt();
                            input.nextLine(); // Consume the newline
                            if (flowChoice > 0 && flowChoice <= flows.size()) {
                                Flow_21159364_BricenoVilches flowElegido = flows.get(flowChoice -1);
                                System.out.println("Flujo Elejido:" + flowElegido);
                                int optionChoice;
                                System.out.println("Elija opcion a añadir al flujo");
                                optionInstance = new Option_21159364_BricenoVilches();
                                optionInstance.mostrarOpciones(options);
                                optionChoice = input.nextInt();
                                input.nextLine();
                                if (optionChoice > 0 && optionChoice <= options.size()) {
                                    Option_21159364_BricenoVilches opcionElegida = options.get(optionChoice - 1);
                                    flowElegido.flowAddOption(opcionElegida);
                                } else {
                                    System.out.println("Numero de opcion invalido. Intentelo de nuevo.");
                                }
                            } else {
                                System.out.println("Numero de flow invalido. Intentelo de nuevo.");
                            }
                        } else {
                            System.out.println("No hay flows en el sistema");
                        }
                        break;

                    case 5:
                        if (!flows.isEmpty()) {
                            flowInstance = new Flow_21159364_BricenoVilches();
                            flowInstance.mostrarFlows(flows);
                        } else {
                            System.out.println("No hay flows en el sistema");
                        }
                        break;
                    case 6:
                        Chatbot_21159364_BricenoVilches chatbotInstance = new Chatbot_21159364_BricenoVilches().crearChatbotConsola(input, flows);
                        chatbots.add(chatbotInstance);
                        System.out.println("Chatbot creado:" + chatbotInstance);
                        break;
                    case 7:
                        if (!chatbots.isEmpty()) {
                            System.out.println("Elige un chatbot al cual añadirle un flujo");
                            chatbotInstance = new Chatbot_21159364_BricenoVilches();
                            chatbotInstance.mostrarChatbots(chatbots);
                            int chatbotChoice;
                            System.out.println("Numero de chatbot a añadirle un flujo:");
                            chatbotChoice = input.nextInt();
                            input.nextLine();
                            if (chatbotChoice > 0 && chatbotChoice <= chatbots.size()) {
                                Chatbot_21159364_BricenoVilches chatbotElegido = chatbots.get(chatbotChoice -1);
                                System.out.println("Chatbot Elejido:" + chatbotElegido);
                                int flowChoice;
                                System.out.println("Elija flujo a añadir al chatbot");
                                flowInstance = new Flow_21159364_BricenoVilches();
                                flowInstance.mostrarFlows(flows);
                                flowChoice = input.nextInt();
                                input.nextLine();
                                if (flowChoice > 0 && flowChoice <= flows.size()) {
                                    Flow_21159364_BricenoVilches flowElegido = flows.get(flowChoice - 1);
                                    chatbotElegido.chatbotAddFlow(flowElegido);
                                } else {
                                    System.out.println("Numero de flujo invalido. Intentelo de nuevo.");
                                }
                            } else {
                                System.out.println("Numero de chatbot invalido. Intentelo de nuevo.");
                            }
                        } else {
                            System.out.println("No hay chatbots en el sistema");
                        }
                        break;
                    case 8:
                        if (!chatbots.isEmpty()) {
                            chatbotInstance = new Chatbot_21159364_BricenoVilches();
                            chatbotInstance.mostrarChatbots(chatbots);
                        } else {
                            System.out.println("No hay chatbots en el sistema");
                        }
                        break;
                    case 9:
                        System_21159364_BricenoVilches systemInstance = new System_21159364_BricenoVilches().crearSystemConsola(input, chatbots);
                        systems.add(systemInstance);
                        System.out.println("Sistema creado:" + systemInstance);
                        break;
                    case 10:
                        System.out.println("Elija el sistema a usar: \n");
                        systemAbierto.mostrarSystems(systems);
                        System.out.println("Elija numero de sistema:");
                        int systemChoice = input.nextInt();
                        input.nextLine();
                        if (systemChoice > 0 && systemChoice <= systems.size()) {
                            System.out.println("Sistema elegido: "+ systems.get(systemChoice - 1));
                        } else {System.out.println("Opcion invalida.");}
                        systemInstance = systems.get(systemChoice - 1);
                        List <Usuarios_21159364_BricenoVilches> usuarios = systemInstance.getUsers();
                        Usuarios_21159364_BricenoVilches userlogged = systemAbierto.getUserLogged();
                        if (Usuarios_21159364_BricenoVilches.findUser(systemInstance.getUsers(), userlogged.getUserName()) == null) {
                            usuarios.add(userlogged);
                            systemInstance.setUsers(usuarios);
                        }
                        systemAbierto.systemLogout();
                        systemInstance.systemLogin(userlogged.getUserName());
                        systemAbierto = systemInstance;
                        break;
                    case 11:
                        chatbotInstance = new Chatbot_21159364_BricenoVilches();
                        chatbotInstance.mostrarChatbots(chatbots);
                        System.out.println("Elige un chatbot al cual añadirle al sistema");
                        int chatbotChoice;
                        System.out.println("Numero de chatbot a añadirle al sistema:");
                        chatbotChoice = input.nextInt();
                        input.nextLine();
                        if (chatbotChoice > 0 && chatbotChoice <= chatbots.size()) {
                            Chatbot_21159364_BricenoVilches chatbotElegido = chatbots.get(chatbotChoice -1);
                            System.out.println("Chatbot Elejido:" + chatbotElegido);
                            systemAbierto.systemAddChatbot(chatbotElegido);
                        } else {
                            System.out.println("Numero de chatbot invalido. Intentelo de nuevo.");
                        }
                        break;
                    case 12:
                        systemAbierto.mostrarSystems(systems);
                        break;
                    case 13:
                        String mensaje;
                        String EXIT_TALK = "0";
                        systemAbierto.encontrarChatbotInicial().setStartFlowId(1);
                        systemAbierto.setInitialChatbotCodeLink(1); //Reinicia el sistema
                        do {
                            systemAbierto.encontrarChatbotInicial().encontrarFlowInicial().mostrarOpcionesFlow(); //Mostrara las opciones
                            System.out.println("Introduzca su opcion a elegir (presione 0 para salir): ");
                            mensaje = input.nextLine();
                            if (mensaje.equalsIgnoreCase(EXIT_TALK)){
                                break;
                            }
                            systemAbierto.systemTalk(mensaje);
                        }while (true);
                        break;
                    case 14:
                        String userName;
                        System.out.println("Introduzca el nombre de un usuario del sistema de quien quiere ver su historial: ");
                        userName = input.nextLine();
                        systemAbierto.systemSynthesis(userName);
                        break;
                    case 15:
                        System.out.println("Introduzca la cantidad de interacciones a generar: ");
                        int maxInteractions = input.nextInt();
                        input.nextLine();
                        System.out.println("Introduzca un numero para generar la semilla: ");
                        int seed = input.nextInt();
                        input.nextLine();
                        systemAbierto.systemSimulate(maxInteractions, seed, systemAbierto);
                        break;
                    case 16:
                        systemAbierto.systemLogout();
                        menuInicial(systemAbierto);
                        break;
                    default:
                        System.out.println(choice + " No es una opcion valida.");

                }
            } while (choice != MENU_EXIT_OPTION);
        }
    /**
     * Ejecuta el menu de un usuario regular en donde solo se puede interactuar con el sistema y visualizar estos para cambiarse a otro sistema.
     * @param systemAbierto (System_21159364_BricenoVilches)
     * @return void
     */
    private void menuUser(System_21159364_BricenoVilches systemAbierto){
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 5;

        int choice;
        do {
            System.out.println("Menu User\n");
            System.out.print("1. Hablar con chatbot \n");
            System.out.print("2. Sintesis de historial de usuario.\n");
            System.out.print("3. Emular conversacion.\n");
            System.out.print("4. Cambiar sistema.\n");
            System.out.print("5. Deslogear.\n");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                    String mensaje;
                    String EXIT_TALK = "0";
                    systemAbierto.encontrarChatbotInicial().setStartFlowId(1);
                    systemAbierto.setInitialChatbotCodeLink(1); //Reinicia el sistema
                    do {
                        systemAbierto.encontrarChatbotInicial().encontrarFlowInicial().mostrarOpcionesFlow(); //Mostrara las opciones
                        System.out.println("Introduzca su opcion a elegir (presione 0 para salir): ");
                        mensaje = input.nextLine();
                        if (mensaje.equalsIgnoreCase(EXIT_TALK)){
                            break;
                        }
                        systemAbierto.systemTalk(mensaje);
                    }while (true);
                    break;
                case 2:
                    String userName;
                    System.out.println("Introduzca el nombre de un usuario del sistema de quien quiere ver su historial: ");
                    userName = input.nextLine();
                    systemAbierto.systemSynthesis(userName);
                    break;
                case 3:
                    System.out.println("Introduzca la cantidad de interacciones a generar: ");
                    int maxInteractions = input.nextInt();
                    input.nextLine();
                    System.out.println("Introduzca un numero para generar la semilla: ");
                    int seed = input.nextInt();
                    input.nextLine();
                    systemAbierto.systemSimulate(maxInteractions, seed, systemAbierto);
                    break;
                case 4:
                    System.out.println("Elija el sistema a usar: \n");
                    systemAbierto.mostrarSystems(systems);
                    System.out.println("Elija numero de sistema:");
                    int systemChoice = input.nextInt();
                    input.nextLine();
                    if (systemChoice > 0 && systemChoice <= systems.size()) {
                        System.out.println("Sistema elegido: "+ systems.get(systemChoice - 1));
                    } else {System.out.println("Opcion invalida.");}
                    System_21159364_BricenoVilches systemInstance = systems.get(systemChoice - 1);
                    List <Usuarios_21159364_BricenoVilches> usuarios = systemInstance.getUsers();
                    Usuarios_21159364_BricenoVilches userlogged = systemAbierto.getUserLogged();
                    if (Usuarios_21159364_BricenoVilches.findUser(systemInstance.getUsers(), userlogged.getUserName()) == null) {
                        usuarios.add(userlogged);
                        systemInstance.setUsers(usuarios);
                    }
                    systemAbierto.systemLogout();
                    systemInstance.systemLogin(userlogged.getUserName());
                    systemAbierto = systemInstance;
                    break;
                case 5:
                    systemAbierto.systemLogout();
                    menuInicial(systemAbierto);
                    break;
            }
        }while (choice != MENU_EXIT_OPTION);
    }
}