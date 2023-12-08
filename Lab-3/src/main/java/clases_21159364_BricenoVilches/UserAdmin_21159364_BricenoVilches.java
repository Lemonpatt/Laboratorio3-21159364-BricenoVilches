package clases_21159364_BricenoVilches;

import java.util.List;

public class UserAdmin_21159364_BricenoVilches extends Usuarios_21159364_BricenoVilches {

    public UserAdmin_21159364_BricenoVilches(String userName) {
        super(userName);
    }
    @Override
    public boolean isAdmin() {
        return true;
    }
}
