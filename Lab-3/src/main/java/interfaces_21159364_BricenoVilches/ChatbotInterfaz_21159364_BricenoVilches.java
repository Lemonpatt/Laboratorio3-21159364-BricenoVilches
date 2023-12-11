package interfaces_21159364_BricenoVilches;

import clases_21159364_BricenoVilches.Chatbot_21159364_BricenoVilches;
import clases_21159364_BricenoVilches.Flow_21159364_BricenoVilches;


import java.util.List;
import java.util.Scanner;

public interface ChatbotInterfaz_21159364_BricenoVilches {

    int getChatbotId();

    String getName();

    int getStartFlowId();

    void setStartFlowId(int startFlowId);

    List<Flow_21159364_BricenoVilches> getFlows();

    Chatbot_21159364_BricenoVilches crearChatbotConsola(Scanner input, List<Flow_21159364_BricenoVilches> flowsDisponibles);

    void chatbotAddFlow(Flow_21159364_BricenoVilches flow);

    boolean flowDuplicado(List<Flow_21159364_BricenoVilches> flows, int id);

    void mostrarChatbots(List<Chatbot_21159364_BricenoVilches> chatbots);

    String toString();

    Flow_21159364_BricenoVilches encontrarFlowInicial();
}
