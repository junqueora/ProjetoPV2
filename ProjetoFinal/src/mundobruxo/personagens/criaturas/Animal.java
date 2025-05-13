package mundobruxo.personagens.criaturas;

public class Animal extends Criatura{

    private String barulho;

    public Animal(String nome, int idade, String sexo, String especie) {
        super(nome, idade, sexo, especie);
    }

    @Override
    public void mostraInfo() {

    }

    public void fazerBarulho(String barulho) {

    }
}
