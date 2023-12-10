package clases_21159364_BricenoVilches;


/**
 * Clase de un Usuario Administrador que hereda la clase abstracta de Usuarios.
 * Herencia de Usuarios_21159364_BricenoVilches
 */
public class UserAdmin_21159364_BricenoVilches extends Usuarios_21159364_BricenoVilches {
    /**
     * <p> Constructor de un UserAdmin
     * </p>
     * @param userName (String) tomado desde atributos de Usuarios_21159364_BricenoVilches
     * @return UserAdmin_21159364_BricenoVilches
     */
    public UserAdmin_21159364_BricenoVilches(String userName) {
        super(userName);
    }

    /**
     * <p> Revisa si un usuario es de tipo Admin o regular, Sobreescritura
     * </p>
     * @param null
     * @return True si Usuario es tipo Admin, False si Usuario es de tipo normal
     */
    @Override
    public boolean isAdmin() {
        return true;
    }
}
