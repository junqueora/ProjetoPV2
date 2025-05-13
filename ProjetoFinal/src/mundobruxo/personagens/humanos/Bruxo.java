package mundobruxo.personagens.humanos;

import mundobruxo.interfaces.Magico;

public class Bruxo extends Humano implements Magico {

    private int poder;
    private String casa;

    public Bruxo(String nome, int idade, String sexo, int poder, String casa) {
        super(nome, idade, sexo);
        this.poder = poder;
        this.casa = casa;
    }

    @Override
    public void mostraInfo() {

    }

    public void usarFeitico(String feitico) {

    }

    @Override
    public void usarMagia(String magia) {

    }
}
