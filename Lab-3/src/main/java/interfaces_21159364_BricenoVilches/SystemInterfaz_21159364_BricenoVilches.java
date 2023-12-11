package interfaces_21159364_BricenoVilches;

import clases_21159364_BricenoVilches.Chatbot_21159364_BricenoVilches;
import clases_21159364_BricenoVilches.System_21159364_BricenoVilches;
import clases_21159364_BricenoVilches.Usuarios_21159364_BricenoVilches;

import java.util.List;
import java.util.Scanner;


public interface SystemInterfaz_21159364_BricenoVilches {
    int getInitialChatbotCodeLink();

    void setInitialChatbotCodeLink(int initialChatbotCodeLink);

    List<Usuarios_21159364_BricenoVilches> getUsers();

    void setUsers(List<Usuarios_21159364_BricenoVilches> users);

    Usuarios_21159364_BricenoVilches getUserLogged();

    List<Chatbot_21159364_BricenoVilches> getChatbots();

    System_21159364_BricenoVilches crearSystemConsola(Scanner input, List<Chatbot_21159364_BricenoVilches> chatbotsDisponibles);

    boolean chatbotDuplicado(List<Chatbot_21159364_BricenoVilches> chatbots, int id);

    boolean userDuplicado(List<Usuarios_21159364_BricenoVilches> users, String userName);

    void mostrarSystems(List<System_21159364_BricenoVilches> systems);

    String toString();

    void systemAddChatbot(Chatbot_21159364_BricenoVilches chatbot);

    void systemAddUser(Usuarios_21159364_BricenoVilches user);

    void systemLogin(String userName);

    void systemLogout();

    void eliminarUser(String userName);

    void systemTalk(String mensaje);

    Chatbot_21159364_BricenoVilches encontrarChatbotInicial();

    void systemSynthesis(String userName);

    void systemChatHistory();

    void systemSimulate(int maxInteractions, int seed, System_21159364_BricenoVilches system);
}
