package mundobruxo.personagens.criaturas;

import mundobruxo.personagens.Personagem;

public abstract class Criatura extends Personagem {

    protected String especie;

    public Criatura(String nome, int idade, String sexo, String especie) {
        super(nome, idade, sexo);
        this.especie = especie;
    }
}
