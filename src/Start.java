
public class Start {

    public static void main(String[] args) {
        Usuarios currentuser = new Usuarios();
        Login auth = new Login();
        auth.register("lucas.teste", "123");
        
        new telalogin(currentuser, auth).setVisible(true);
    }
    
}
