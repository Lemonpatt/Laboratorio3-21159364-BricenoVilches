package clases_21159364_BriceñoVilches;

import java.util.List;

public class Option_21159364_BriceñoVilches {
    private int id;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private List<String> keywords;

/**

 */
    /
    public Option_21159364_BriceñoVilches(int id, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords) {
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    public int getId() {
        return id;
    }
}
}
