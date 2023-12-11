package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.OptionInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase de una opcion que implementa la interfaz de Option.
 * Implementación de OptionInterfaz_21159364_BricenoVilches
 */
public class Option_21159364_BricenoVilches implements OptionInterfaz_21159364_BricenoVilches {
    private int id;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private List<String> keywords;



    /**
     * <p> Constructor que crea una instancia de Option_21159364_BricenoVilches vacio
     * </p>
     * @param null
     * @return Option_21159364_BricenoVilches
     */

    public Option_21159364_BricenoVilches() {
        this.id = 0;
        this.message = "";
        this.chatbotCodeLink = 0;
        this.initialFlowCodeLink = 0;
        this.keywords = new ArrayList<>();
    }

    /**
     * <p> RF 1: Constructor que crea una instancia de Option_21159364_BricenoVilches, Sobrecarga
     * </p>
     * @param id (int) id de la opcion
     * @param message (String) mensaje de la opcion
     * @param chatbotCodeLink (int) Id del chatbot inicial
     * @param initialFlowCodeLink (int) id flow inicial
     * @param keywords (List) lista de keywords
     * @return Option_21159364_BricenoVilches
     */
    public Option_21159364_BricenoVilches(int id, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords) {
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
        System.out.println("Opcion creada exitosamente");
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
     * <p> Getter de message
     * </p>
     * @param null
     * @return message (String)
     */

    public String getMessage() {
        return message;
    }

    /**
     * <p> Getter de ChatbotCodeLink
     * </p>
     * @param null
     * @return ChatbotCodeLink (int)
     */
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }


    /**
     * <p> Getter de initialFlowCodeLink
     * </p>
     * @param null
     * @return initialFlowCodeLink (int)
     */
    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }


    /**
     * <p> Getter de keywords
     * </p>
     * @param null
     * @return keywords (List)
     */
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * <p> Permite crear una opcion dandole sus atributos por consola primero y despues llamando al constructor
     * </p>
     * @param input A traves de consola
     * @return Option_21159364_BricenoVilches
     */
    public Option_21159364_BricenoVilches crearOpcionConsola(Scanner input) {
        System.out.println("Ingrese el ID:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el mensaje:");
        String message = input.nextLine();
        System.out.println("Ingrese el ChatbotCodeLink:");
        int chatbotCodeLink = input.nextInt();
        System.out.println("Ingrese el InitialFlowCodeLink:");
        int initialFlowCodeLink = input.nextInt();
        input.nextLine();
        List<String> keywords = new ArrayList<>();
        System.out.println("Ingrese palabras clave (separadas por espacio):");
        String keywordInput = input.nextLine();
        String[] keywordArray = keywordInput.split(" ");
        for (String keyword : keywordArray) {
            keywords.add(keyword);
        }

        return new Option_21159364_BricenoVilches(id, message, chatbotCodeLink, initialFlowCodeLink, keywords);
    }

    /**
     * <p> Muestra por consola todas las opciones de una lista
     * </p>
     * @param opciones lista de opciones a mostrar
     * @return void
     */
    public void mostrarOpciones(List<Option_21159364_BricenoVilches> opciones){
        int i = 1;
        for (Option_21159364_BricenoVilches opcion : opciones){
            System.out.println((i++)+ ". " + opcion);
        }
    }

    /**
     * <p> Escribe una instancia de opcion como String si es pedido
     * </p>
     * @param null
     * @return String
     */
    public String toString(){
        return "Option(" + id + "," + message +"," + chatbotCodeLink + "," + initialFlowCodeLink +"," + keywords+")";
    }
}

