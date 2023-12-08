package clases_21159364_BricenoVilches;


import java.util.List;

public class User_21159364_BricenoVilches extends Usuarios_21159364_BricenoVilches {

    public User_21159364_BricenoVilches(String userName) {
        super(userName);
    }


    @Override
    public boolean isAdmin(){
        return false;
    }
}
