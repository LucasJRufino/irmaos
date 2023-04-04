
import java.awt.Color;
import java.io.File;

public class Start {

    public static void main(String[] args) {

        Usuario currentuser = new Usuario();
        Login auth = new Login();
        Color corbase = new Color(56, 146, 255);
        Empresa empresa = new Empresa("Irmãos TI", corbase, "27.094.721/0001-64", "12031-190",
                "Rua Desova", "666", "Jardim Pedrinho Matador", "SP", "(12) 99666-6969");
        auth.register("lucas.teste", "123");
        File imagem = new File("src/logo/irmaoslogocomplete.png");
        empresa.setLogo(imagem);
        new telalogin(currentuser, auth, empresa).setVisible(true);
    }

}
