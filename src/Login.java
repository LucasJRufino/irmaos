
import java.util.ArrayList;

public class Login {

    Usuario user;
    Usuario altera;
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public Login() {
    }

    public void register(String nome, String senha) {
        usuarios.add(new Usuario(nome, senha));
    }

    public String getNome(Usuario user) {
        return user.getNickname();
    }

    public void setSenha(Usuario user, String senha) {
        int index = usuarios.indexOf(user);
        usuarios.get(index).setPassword(senha);
    }

    public Usuario login(String login, String senha) {
        for (Usuario i : usuarios) {
            if (i.autentica(login, senha)) {
                return i;
            }
        }
        return null;
    }

    public String usuarios() {
        StringBuilder str = new StringBuilder();
        for (Usuario i : usuarios) {
            str.append(i.getNickname() + " | " + i.getPassword() + "\n");
        }
        return str.toString();
    }

    public boolean jaExiste(String nome) {
        for (Usuario i : usuarios) {
            if (i.getNickname().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public Usuario identifica(String nomeuser) {
        for (Usuario i : usuarios) {
            if (i.getNickname().equals(nomeuser)) {
                return i;
            }
        }
        return null;
    }

    public void excluir(Usuario user) {
        usuarios.remove(user);
    }
}
