package mundobruxo.itens;

import mundobruxo.interfaces.Magico;

public class Objeto_magico extends Item implements Magico {

    private String habilidade;

    public Objeto_magico(String nome, String habilidade) {
        super(nome);
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
