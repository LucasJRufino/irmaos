

public class Usuario {
    public String nickname;
    public String password;
    public String cpf;

    public Usuario() {
    }

    public Usuario( String nome, String senha) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean autentica(String login, String senha) {
        if (login.equals(getNickname()) && senha.equals(getPassword())){
            return true;
        } else {
        return false;
        }
    }
}
