import clases_21159364_BricenoVilches.Option_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Option_21159364_BricenoVilches> options = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 5;

        int choice;

        do {
            printMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    Option_21159364_BricenoVilches newOption = Option_21159364_BricenoVilches.crearOpcionConsola(input);
                    options.add(newOption);
                    break;

                case 2:
                    Option_21159364_BricenoVilches.mostrarOpciones(options);
                    break;

                case 3:
                    System.out.println("Sum 2 numbers");
                    System.out.println("Ingrese un número int y luego presione ENTER:");
                    var n1 = input.nextInt();
                    System.out.println("Ingrese otro número int y luego presione ENTER:");
                    var n2 = input.nextInt();
                    int sum = n1 + n2;
                    System.out.println("La suma es: " + sum);
                    break;

                case 4:
                    //do something
                    break;

                case 5:
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
        System.out.print("2. Mostrar opcion.\n");
        System.out.print("3. Sum 2 numbers.\n");
        System.out.print("4. Some option.\n");
        System.out.print("5. Exit\n");
        System.out.print("\nEnter your choice: ");
    }
}