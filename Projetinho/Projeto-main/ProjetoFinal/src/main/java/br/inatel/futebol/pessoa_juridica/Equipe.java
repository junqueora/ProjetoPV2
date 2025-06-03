package main.java.br.inatel.futebol.pessoa_juridica;

import main.java.br.inatel.futebol.campeonatos.Campeonato;
import main.java.br.inatel.futebol.pessoa_fisica.Jogador;
import main.java.br.inatel.futebol.pessoa_fisica.Tecnico;

import java.util.ArrayList;
import java.util.List;

public class Equipe extends Empresa{

    private int fundacao;
    private String sede;
    private List<Jogador> lista_jogadores = new ArrayList<>();
    private Tecnico tecnico;
    private List<Patrocinador> lista_patrocinadores = new ArrayList<>();
    private List<Integer> valor_patrocinadores = new ArrayList<>();
    private List<Campeonato> lista_campeonatos = new ArrayList<>();

    public Equipe(String nome,String cnpj, int fundacao, String sede) {
        super(nome,cnpj);
        this.fundacao = fundacao;
        this.sede = sede;
    }

    public void adcionaJogador(Jogador jogador) {
        lista_jogadores.add(jogador);
    }

    public void adcionaTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void adicionarPatrocinador(Patrocinador patrocinador, int valor) {
        lista_patrocinadores.add(patrocinador);
        valor_patrocinadores.add(valor);
        patrocinador.adicionarEquipe(this);
    }

    public void adicionarCampeonato(Campeonato campeonato) {
        lista_campeonatos.add(campeonato);
        campeonato.adicionarEquipe(this);
    }

    public void mostrarInfo(){
        System.out.println("\nNome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Fundacao: " + fundacao);
        System.out.println("Sede: " + sede);
        try {
            System.out.println("Técnico: " + tecnico.getNome());
        } catch (NullPointerException e) {
            System.out.println("A equipe está sem técnico!");
        }
        System.out.println("Lista Jogadores: ");
        for (Jogador jogador : lista_jogadores) {
            System.out.println("Nome: " + jogador.getNome());
        }
        System.out.println("Lista Patrocinadores: ");
        for (int i = 0; i < valor_patrocinadores.size(); i++) {
            System.out.println("Nome: " + lista_patrocinadores.get(i).getNome());
            System.out.println("Valor: " + valor_patrocinadores.get(i));
        }
        System.out.println("Lista campeonatos: ");
        for(Campeonato campeonato : lista_campeonatos) {
            System.out.println("Nome: " + campeonato.getNome());
        }
    }

    public int getFundacao() {
        return fundacao;
    }

    public String getSede() {
        return sede;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public List<Integer> getValor_patrocinadores() {
        return valor_patrocinadores;
    }
}
