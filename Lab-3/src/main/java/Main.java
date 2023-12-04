import clases_21159364_BricenoVilches.Flow_21159364_BricenoVilches;
import clases_21159364_BricenoVilches.Option_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<Option_21159364_BricenoVilches> options = new ArrayList<>();
    List<Flow_21159364_BricenoVilches> flows = new ArrayList<>();
    public static void main(String[] args){
        Main mainInstance = new Main();
        mainInstance.run();
    }
    public void run() {
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 8;

        int choice;
        Option_21159364_BricenoVilches op1 = new Option_21159364_BricenoVilches(1, "opcion1", 1, 2, Arrays.asList("viajar", "descanso"));
        Option_21159364_BricenoVilches op2 = new Option_21159364_BricenoVilches(2, "opcion2", 1, 2, Arrays.asList("universidad", "blahblah"));
        Flow_21159364_BricenoVilches f1 = new Flow_21159364_BricenoVilches(1, "flow1", Arrays.asList(op1, op2));
        options.add(op1);
        options.add(op2);
        flows.add(f1);
        do {
            printMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    Option_21159364_BricenoVilches Option = Option_21159364_BricenoVilches.crearOpcionConsola(input);
                    options.add(Option);
                    break;
                case 2:
                    if (!options.isEmpty()) {
                        Option_21159364_BricenoVilches.mostrarOpciones(options);
                    } else {
                        System.out.println("No hay opciones en el sistema");
                    }
                    break;
                case 3:
                    Flow_21159364_BricenoVilches Flow = Flow_21159364_BricenoVilches.crearFlowConsola(input, options);
                    flows.add(Flow);
                    break;

                case 4:
                    if (!flows.isEmpty()) {
                        Flow_21159364_BricenoVilches.mostrarFlows(flows);
                        System.out.println("Elije un flow al cual añadirle una opción");
                        int flowChoice;
                        System.out.println("Número de flow a añadirle una opción:");
                        flowChoice = input.nextInt();
                        input.nextLine(); // Consume the newline
                        if (flowChoice > 0 && flowChoice <= flows.size()) {
                            Flow_21159364_BricenoVilches flowElegido = flows.get(flowChoice -1);
                            System.out.println("Flujo añadido:" + flowElegido);
                            int optionChoice;
                            System.out.println("Eliga opción a añadir al flujo");
                            Option_21159364_BricenoVilches.mostrarOpciones(options);
                            optionChoice = input.nextInt();
                            input.nextLine();
                            if (optionChoice > 0 && optionChoice <= options.size()) {
                                Option_21159364_BricenoVilches opcionElegida = options.get(optionChoice - 1);
                                flowElegido.flowAddOption(opcionElegida);
                                System.out.println("Flujo modificado:" + flowElegido);
                            } else {
                                System.out.println("Número de opción inválido. Inténtelo de nuevo.");
                            }
                        } else {
                            System.out.println("Número de flow inválido. Inténtelo de nuevo.");
                        }
                    } else {
                        System.out.println("No hay flows en el sistema");
                    }
                    break;

                case 5:
                    if (!flows.isEmpty()) {
                        Flow_21159364_BricenoVilches.mostrarFlows(flows);
                    } else {
                        System.out.println("No hay flows en el sistema");
                    }
                    break;
                case 6:

                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Bye.. Que la Fuerza te acompañe");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid option! Please select correct option.");

            }
        } while (choice != MENU_EXIT_OPTION);
    }

    private static void printMenu() {
        System.out.println("Main Menu\n");
        System.out.print("1. Crear Opción \n");
        System.out.print("2. Mostrar opciones.\n");
        System.out.print("3. Crear Flujo.\n");
        System.out.print("4. Añadir opción a flujo.\n");
        System.out.print("5. Mostrar flujos.\n");
        System.out.print("6. Some option.\n");
        System.out.print("7. Some option.\n");
        System.out.print("8. Exit\n");
        System.out.print("\nEnter your choice: ");
    }
}