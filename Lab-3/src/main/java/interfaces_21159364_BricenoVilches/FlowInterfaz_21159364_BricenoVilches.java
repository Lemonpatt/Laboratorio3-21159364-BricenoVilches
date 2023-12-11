package interfaces_21159364_BricenoVilches;

import clases_21159364_BricenoVilches.Flow_21159364_BricenoVilches;
import clases_21159364_BricenoVilches.Option_21159364_BricenoVilches;

import java.util.List;
import java.util.Scanner;

public interface FlowInterfaz_21159364_BricenoVilches {
    int getId();

    String getName();

    List<Option_21159364_BricenoVilches> getOptions();

    Flow_21159364_BricenoVilches crearFlowConsola(Scanner input, List<Option_21159364_BricenoVilches> optionsDisponibles);

    void flowAddOption(Option_21159364_BricenoVilches option);

    boolean optionDuplicada(List<Option_21159364_BricenoVilches> options, int id);

    void mostrarFlows(List<Flow_21159364_BricenoVilches> flows);

    String toString();

    void mostrarOpcionesFlow();
}
