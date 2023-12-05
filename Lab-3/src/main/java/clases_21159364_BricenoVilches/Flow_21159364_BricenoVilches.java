package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.FlowInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Flow_21159364_BricenoVilches implements FlowInterfaz_21159364_BricenoVilches {
    private int id;
    private String name;
    private List<Option_21159364_BricenoVilches> options;

    /**

     */
    public Flow_21159364_BricenoVilches() {
        this.id = 0;
        this.name = "";
        this.options = new ArrayList<>();
    }
    public Flow_21159364_BricenoVilches(int id, String name, List<Option_21159364_BricenoVilches> options) {
        this.id = id;
        this.name = name;
        this.options = options;
        System.out.println("Flow creado exitósamente");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOptions(List<Option_21159364_BricenoVilches> options) {
        this.options = options;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Option_21159364_BricenoVilches> getOptions() {
        return options;
    }

    public Flow_21159364_BricenoVilches crearFlowConsola(Scanner input, List<Option_21159364_BricenoVilches> optionsDisponibles) {
        System.out.println("Ingrese el ID:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el nombre del flujo:");
        String name = input.nextLine();
        List<Option_21159364_BricenoVilches> opciones = new ArrayList<>();
        System.out.println("Opciones disponibles:");
        Option_21159364_BricenoVilches optionInstance = new Option_21159364_BricenoVilches();
        optionInstance.mostrarOpciones(optionsDisponibles);
        System.out.println("Elija el número de la opcion a agregar (presione 0 para salir):");
        int optionChoice;
        do {
            System.out.println("Número de opción:");
            optionChoice = input.nextInt();
            input.nextLine(); // Consume the newline

            if (optionChoice > 0 && optionChoice <= optionsDisponibles.size()) {
                Option_21159364_BricenoVilches opcionElegida = optionsDisponibles.get(optionChoice -1);
                if (!optionDuplicada(opciones, opcionElegida.getId())) {
                    opciones.add(opcionElegida);
                } else {
                    System.out.println("La Id de esta opción se encuentra repetida en el Flujo");
                }
            } else if (optionChoice != 0) {
                System.out.println("Número de opción inválido. Inténtelo de nuevo.");
            }
        } while (optionChoice != 0);

        return new Flow_21159364_BricenoVilches(id, name, opciones);
    }
    public void flowAddOption(Option_21159364_BricenoVilches option){
        if (!optionDuplicada(getOptions(), option.getId())) {
            this.options.add(option);
        } else {
        System.out.println("Id opción duplicada");
        }
    }
    private boolean optionDuplicada(List<Option_21159364_BricenoVilches> options, int id){
        for(Option_21159364_BricenoVilches option : options){
            if (option.getId() == id){
                return true;
            }
        }
        return false;
    }
    public void mostrarFlows(List<Flow_21159364_BricenoVilches> flows){
        int i = 1;
        for (Flow_21159364_BricenoVilches flow : flows){
            System.out.println((i++) + ". " +flow);
        }
    }
    public String toString(){
        return "Flow(" + id + "," + name +"," + options +")";
    }
}
