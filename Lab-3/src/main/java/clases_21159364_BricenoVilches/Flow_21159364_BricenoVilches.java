package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.FlowInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


/**
 * Clase de un flujo que implementa la interfaz de flow.
 * Implementación de FlowInterfaz_21159364_BricenoVilches
 * Agregación de Option_21159364_BricenoVilches
 */
public class Flow_21159364_BricenoVilches implements FlowInterfaz_21159364_BricenoVilches {
    private int id;
    private String name;
    private List<Option_21159364_BricenoVilches> options;

    /**
     * <p> Constructor que crea una instancia de Flow_21159364_BricenoVilches vacio
     * </p>
     * @param null
     * @return Flow_21159364_BricenoVilches
     */
    public Flow_21159364_BricenoVilches() {
        this.id = 0;
        this.name = "";
        this.options = new ArrayList<>();
    }

    /**
     * <p> RF 2: Constructor que crea una instancia de Flow_21159364_BricenoVilches, Sobrecarga
     * </p>
     * @param id (int) id del flujo
     * @param name (String) nombre del flujo
     * @param options (List) lista de opciones
     * @return Flow_21159364_BricenoVilches
     */
    public Flow_21159364_BricenoVilches(int id, String name, List<Option_21159364_BricenoVilches> options) {
        this.id = id;
        this.name = name;
        this.options = options;
        System.out.println("Flow creado exitosamente");
    }

    /**
     * <p> Getter de id
     * </p>
     * @param null
     * @return id (int)
     */
    public int getId() {
        return id;
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
     * <p> Getter de options
     * </p>
     * @param null
     * @return options (List) lista de opciones
     */
    public List<Option_21159364_BricenoVilches> getOptions() {
        return options;
    }

    /**
     * <p> Permite crear un flujo dandole sus atributos por consola primero y despues llamando al constructor
     * </p>
     * @param input A traves de consola
     * @param optionsDisponibles lista de opciones disponibles a agregar al flujo
     * @return Flow_21159364_BricenoVilches
     */

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
        System.out.println("Elija el numero de la opcion a agregar (presione 0 para salir):");
        int optionChoice;
        do {
            System.out.println("Numero de opcion:");
            optionChoice = input.nextInt();
            input.nextLine(); // Consume the newline

            if (optionChoice > 0 && optionChoice <= optionsDisponibles.size()) {
                Option_21159364_BricenoVilches opcionElegida = optionsDisponibles.get(optionChoice -1);
                if (!optionDuplicada(opciones, opcionElegida.getId())) {
                    opciones.add(opcionElegida);
                } else {
                    System.out.println("La Id de esta opcion se encuentra repetida en el Flujo");
                }
            } else if (optionChoice != 0) {
                System.out.println("Numero de opcion invalido. Intentelo de nuevo.");
            }
        } while (optionChoice != 0);

        return new Flow_21159364_BricenoVilches(id, name, opciones);
    }
    /**
     * <p> RF 3: Añade una opcion dado al flujo, revisando si no esta duplicado
     * </p>
     * @param option (Option_21159364_BricenoVilches)
     * @return void
     */
    public void flowAddOption(Option_21159364_BricenoVilches option){
        if (!optionDuplicada(getOptions(), option.getId())) {
            this.options.add(option);
        } else {
        System.out.println("Id opcion duplicada");
        }
    }

    /**
     * <p> Permite revisar si una id de una opcion ya se encuentra en una lista de opciones
     * </p>
     * @param options lista de opciones a revisar
     * @param  id (int) a revisar si se encuentra en la lista
     * @return True si esta duplicado, False si no lo esta
     */
    public boolean optionDuplicada(List<Option_21159364_BricenoVilches> options, int id){
        for(Option_21159364_BricenoVilches option : options){
            if (option.getId() == id){
                return true;
            }
        }
        return false;
    }

    /**
     * <p> Muestra por consola todos los flujos de una lista
     * </p>
     * @param flows lista de flujos a mostrar
     * @return void
     */
    public void mostrarFlows(List<Flow_21159364_BricenoVilches> flows){
        int i = 1;
        for (Flow_21159364_BricenoVilches flow : flows){
            System.out.println((i++) + ". " +flow);
        }
    }

    /**
     * <p> Escribe una instancia de flujo como String si es pedido
     * </p>
     * @param null
     * @return String
     */
    public String toString(){
        return "Flow(" + id + "," + name +"," + options +")";
    }

    /**
     * <p> Muestra por consola todas las opciones de un flujo
     * </p>
     * @param null
     * @return void
     */
    public void mostrarOpcionesFlow(){
        System.out.println(getName() + ": \n");
        for (Option_21159364_BricenoVilches op : options){
            System.out.println(op.getId() + ". " + op.getMessage());
        }
    }
}
