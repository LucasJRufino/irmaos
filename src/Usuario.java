
import java.util.ArrayList;

public class Usuario {

    public String nickname;
    public String password;
    public ArrayList<String> permissoes = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nome, String senha) {
        nickname = nome;
        password = senha;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean autentica(String login, String senha) {
        if (login.equals(getNickname()) && senha.equals(getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionapermissao(String permissao) {
        permissoes.add(permissao);
    }

    public void permissaoLote(String[] permissaolote) {
        for (String i : permissaolote) {
            adicionapermissao(i);
        }
    }

    public boolean temPermissao(String permissao) {
        return permissoes.contains(permissao);
    }

    public void removePermissao(String permissao) {
        permissoes.remove(permissao);
    }

    public boolean checapermissaocategoria(String[] categoria) {
        for (String i : categoria) {
            if (permissoes.contains(i)) {
                return true;
            }
        }
        return true;
    }
}
