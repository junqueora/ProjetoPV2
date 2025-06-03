package main.java.br.inatel.futebol.campeonatos;

import main.java.br.inatel.futebol.pessoa_juridica.Equipe;
import main.java.br.inatel.futebol.pessoa_juridica.Federacao;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

    private int idCampeonato;
    private String nome;
    private int premio;
    private String local;
    private Federacao federacao;
    private List<Equipe> lista_equipes = new ArrayList<>();

    public Campeonato(String nome, String local, int premio, int idCampeonato) {
        this.nome = nome;
        this.local = local;
        this.premio = premio;
        this.idCampeonato = idCampeonato;
    }

    public void adicionarFederacao(Federacao federacao) {
        this.federacao = federacao;
        federacao.adicionarCampeonato(this);
    }

    public void adicionarEquipe(Equipe equipe) {
        lista_equipes.add(equipe);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Premio: " + premio);
        System.out.println("Local: " + local);
        try {
            System.out.println("Federacao: " + federacao.getNome());
        } catch (NullPointerException e) {
            System.out.println("Não foi adicionado a uma federação!");
        }
        System.out.println("Lista equipes: ");
        for(Equipe equipe : lista_equipes) {
            System.out.println("Equipe " + equipe.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdCampeonato() {
        return idCampeonato;
    }

    public int getPremio() {
        return premio;
    }

    public String getLocal() {
        return local;
    }

    public Federacao getFederacao() {
        return federacao;
    }

    public List<Equipe> getLista_equipes() {
        return lista_equipes;
    }
}
