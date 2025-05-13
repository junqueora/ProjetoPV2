package mundobruxo.personagens.criaturas;

import mundobruxo.interfaces.Magico;

public class Criatura_magica extends Criatura implements Magico {

    private int poder;
    private String habilidade;

    public Criatura_magica(String nome, int idade, String sexo, String especie, int poder, String habilidade) {
        super(nome, idade, sexo, especie);
        this.poder = poder;
        this.habilidade = habilidade;
    }

    @Override
    public void mostraInfo() {

    }

    public void usarHabilidade(String habilidade) {

    }

    @Override
    public void usarMagia(String magia) {

    }
}
