package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.FlowInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flow_21159364_BricenoVilches implements FlowInterfaz_21159364_BricenoVilches {
    private int id;
    private String name;
    private List<Option_21159364_BricenoVilches> options;

    /**

     */
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
    public static Flow_21159364_BricenoVilches crearFlowConsola(Scanner input) {
        System.out.println("Ingrese el ID:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el nombre del flujo:");
        String name = input.nextLine();
        List<Option_21159364_BricenoVilches> opciones = new ArrayList<>();
        System.out.println("Ingrese las opciones (separadas por espacio):");
        String opcionesInput = input.nextLine();
        String[] opcionesArray = opcionesInput.split(" ");
        for (String opcion : opcionesArray) {
            opciones.add(opcion);
        }

        return new Flow_21159364_BricenoVilches(id, name, opciones);
    }
}
