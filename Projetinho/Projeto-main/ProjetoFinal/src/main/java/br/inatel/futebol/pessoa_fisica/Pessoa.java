package main.java.br.inatel.futebol.pessoa_fisica;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }
}
