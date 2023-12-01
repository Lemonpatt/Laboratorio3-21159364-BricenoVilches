package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.OptionInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Option_21159364_BricenoVilches implements OptionInterfaz_21159364_BricenoVilches {
    private int id;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private List<String> keywords;

/**

 */
    public Option_21159364_BricenoVilches(int id, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords) {
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
        System.out.println("Opción creada exitósamente");
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    public void setChatbotCodeLink(int chatbotCodeLink) {
        this.chatbotCodeLink = chatbotCodeLink;
    }

    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    public void setInitialFlowCodeLink(int initialFlowCodeLink) {
        this.initialFlowCodeLink = initialFlowCodeLink;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
    public static Option_21159364_BricenoVilches crearOpcionConsola(Scanner input) {
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
    public static void mostrarOpciones(List<Option_21159364_BricenoVilches> opciones){
        for (Option_21159364_BricenoVilches opcion : opciones){
            System.out.println(opcion);
        }
    }
    public String toString(){
        return "Option(" + id + "," + message +"," + chatbotCodeLink + "," + initialFlowCodeLink +"," + keywords+")";
    }
}

