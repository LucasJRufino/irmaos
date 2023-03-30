
import java.util.ArrayList;

public class Login {

    Usuarios user;
    Usuarios altera;
    ArrayList<Usuarios> usuarios = new ArrayList<>();

    public Login() {
    }

    public void register(String nome, String senha) {
        usuarios.add(new Usuarios(nome, senha));
    }

    public String getNome(Usuarios user) {
        return user.getNickname();
    }

    public void setSenha(Usuarios user, String senha) {
        int index = usuarios.indexOf(user);
        usuarios.get(index).setPassword(senha);
    }

    public Usuarios login(String login, String senha) {
        for (Usuarios i : usuarios) {
            if (i.autentica(login, senha)) {
                return i;
            }
        }
        return null;
    }

    public String usuarios() {
        StringBuilder str = new StringBuilder();
        for (Usuarios i : usuarios) {
            str.append(i.getNickname() + " | " + i.getPassword() + "\n");
        }
        return str.toString();
    }

    public boolean jaExiste(String nome) {
        for (Usuarios i : usuarios) {
            if (i.getNickname().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public void excluirUsuario(String usuario) {
        for (Usuarios i : usuarios) {
            if (i.getNickname().equals(usuario)) {
                int index = usuarios.indexOf(i);
                usuarios.remove(index);
            }
        }
    }
}
