package interfaces_21159364_BricenoVilches;

import clases_21159364_BricenoVilches.Option_21159364_BricenoVilches;

import java.util.List;
import java.util.Scanner;

public interface OptionInterfaz_21159364_BricenoVilches {
    int getId();

    String getMessage();

    void setMessage(String message);

    int getChatbotCodeLink();

    void setChatbotCodeLink(int chatbotCodeLink);

    int getInitialFlowCodeLink();

    void setInitialFlowCodeLink(int initialFlowCodeLink);

    List<String> getKeywords();

    void setKeywords(List<String> keywords);

    Option_21159364_BricenoVilches crearOpcionConsola(Scanner input);

    void mostrarOpciones(List<Option_21159364_BricenoVilches> options);
}
