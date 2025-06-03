package main.java.br.inatel.futebol.pessoa_juridica;

public abstract class Empresa {

    protected String nome;
    protected String cnpj;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
