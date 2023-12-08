package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.UsuariosInterfaz_21159364_BricenoVilches;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuarios_21159364_BricenoVilches implements UsuariosInterfaz_21159364_BricenoVilches {
    private String userName;
    private List<String> chatHistory;

    public Usuarios_21159364_BricenoVilches(String userName) {
        this.userName = userName;
        this.chatHistory = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getChatHistory() {
        return chatHistory;
    }

    public void setChatHistory(List<String> chatHistory) {
        this.chatHistory = chatHistory;
    }

    public static Usuarios_21159364_BricenoVilches findUser(List<Usuarios_21159364_BricenoVilches> users, String userName) {
        for (Usuarios_21159364_BricenoVilches user : users) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                if (user instanceof UserAdmin_21159364_BricenoVilches){
                    return new UserAdmin_21159364_BricenoVilches(user.getUserName());
                } else if (user instanceof User_21159364_BricenoVilches){
                    return new User_21159364_BricenoVilches(user.getUserName());
                }
            }
        }
        System.out.println("No se encuentra el usuario");
        return null;
    }
    public boolean userDuplicado(List<Usuarios_21159364_BricenoVilches> users) {
        for (Usuarios_21159364_BricenoVilches user : users) {
            if (user.getUserName().equalsIgnoreCase(this.userName)) {
                return true;
            }
        }
        return false;
    }
    public abstract boolean isAdmin();
}
