package futebol.pessoa_juridica;

import futebol.campeonatos.Campeonato;
import futebol.pessoa_fisica.Arbitro;

import java.util.ArrayList;
import java.util.List;

public class Federacao extends Empresa{

    List<Arbitro> lista_arbitro = new ArrayList<>();
    List<Campeonato> lista_campeonato = new ArrayList<>();

    public Federacao(String nome, int cnpj) {
        super(nome,cnpj);
    }

    public void adicionarArbitro(Arbitro arbitro) {
        lista_arbitro.add(arbitro);
        System.out.println("Adicionado árbitro: " + arbitro.getNome());
    }

    public void adicionarCampeonato(Campeonato campeonato) {
        lista_campeonato.add(campeonato);
        campeonato.adicionarFederacao(this);
        System.out.println("Campeonato adicionado");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Lista de árbitros: ");
        for (Arbitro arbitro : lista_arbitro) {
            System.out.println("Nome: " + arbitro.getNome());
        }
        for(Campeonato campeonato : lista_campeonato){
            System.out.println("Nome: " + campeonato.getNome());
        }
    }
}
