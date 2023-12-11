package interfaces_21159364_BricenoVilches;

import clases_21159364_BricenoVilches.Option_21159364_BricenoVilches;

import java.util.List;
import java.util.Scanner;

public interface OptionInterfaz_21159364_BricenoVilches {
    int getId();

    String getMessage();


    int getChatbotCodeLink();


    int getInitialFlowCodeLink();


    List<String> getKeywords();

    Option_21159364_BricenoVilches crearOpcionConsola(Scanner input);

    void mostrarOpciones(List<Option_21159364_BricenoVilches> options);

    String toString();
}
