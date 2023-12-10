package clases_21159364_BricenoVilches;

import interfaces_21159364_BricenoVilches.UsuariosInterfaz_21159364_BricenoVilches;

import java.util.List;
/**
 * Clase abstracta de un Usuario general que posee atributos de userName y chatHistory como String, e implementa la interfaz de Usuarios.
 * Implementación de UsuariosInterfaz_21159364_BricenoVilches
 */
public abstract class Usuarios_21159364_BricenoVilches implements UsuariosInterfaz_21159364_BricenoVilches {
    public String userName;
    public String chatHistory;
    /**
     * <p> RF 6: Constructor que crea una instancia de Usuarios_21159364_BricenoVilches con un chatHistory vacío
     * </p>
     * @param userName (String) nombre que tendra el nuevo usuario
     * @return Usuarios_21159364_BricenoVilches
     */
    public Usuarios_21159364_BricenoVilches(String userName) {
        this.userName = userName;
        this.chatHistory = "";
    }


    /**
     * <p> Getter de userName
     * </p>
     * @param null
     * @return userName (String)
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p> Getter de chatHistory
     * </p>
     * @param null
     * @return chatHistory (String)
     */
    public String getChatHistory() {
        return chatHistory;
    }

    /**
     * <p> setter de chatHistory
     * </p>
     * @param chatHistory historial de chat a actualizar
     * @return void
     */
    public void setChatHistory(String chatHistory) {
        this.chatHistory = chatHistory;
    }

    /**
     * <p> Retorna una instancia nueva de un usuario encontrado dado un nombre de usuario en una lista de usuarios
     * </p>
     * @param users (List) Lista de usuarios
     * @param userName (String) nombre de usuario a encontrar
     * @return usernew (Usuarios_21159364_BricenoVilches) o null si no encuentra al usuario
     */
    public static Usuarios_21159364_BricenoVilches findUser(List<Usuarios_21159364_BricenoVilches> users, String userName) {
        for (Usuarios_21159364_BricenoVilches user : users) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                if (user instanceof UserAdmin_21159364_BricenoVilches){
                    UserAdmin_21159364_BricenoVilches usernew = new UserAdmin_21159364_BricenoVilches(user.getUserName());
                    usernew.setChatHistory(user.getChatHistory());
                    return usernew;
                } else if (user instanceof User_21159364_BricenoVilches){
                    User_21159364_BricenoVilches usernew = new User_21159364_BricenoVilches(user.getUserName());
                    usernew.setChatHistory(user.getChatHistory());
                    return usernew;
                }
            }
        }
        System.out.println("No se encuentra el usuario");
        return null;
    }

    /**
     * <p> Escribe una instancia de usuario como String si es pedido
     * </p>
     * @param null
     * @return String
     */
    public String toString(){
        return userName;
    }

    /**
     * <p> Metodo abstracto que aplicaran las subclases
     * </p>
     * @param null
     * @return Boolean
     */
    public abstract boolean isAdmin();
}
