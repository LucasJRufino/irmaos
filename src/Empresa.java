
import java.awt.Color;
import java.io.File;

public class Empresa {
    String nome;
    Color cor;
    String cnpj;
    String cep;
    String endereco;
    String numero;
    String bairro;
    String uf;
    String celular;

    public Empresa(String nome, Color cor, String cnpj, String cep, String endereco, String numero, String bairro, String uf, String celular) {
        this.nome = nome;
        this.cor = cor;
        this.cnpj = cnpj;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.uf = uf;
        this.celular = celular;
    }

        public void setter(String nome, Color cor, String cnpj, String cep, String endereco, String numero, String bairro, String uf, String celular) {
        this.nome = nome;
        this.cor = cor;
        this.cnpj = cnpj;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.uf = uf;
        this.celular = celular;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
