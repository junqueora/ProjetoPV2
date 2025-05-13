package mundobruxo.itens;

public class Varinha extends Item{

    private String nucleo;
    private double tamanho;
    private String material;

    public Varinha(String nome, String nucleo, double tamanho, String material) {
        super(nome);
        this.nucleo = nucleo;
        this.tamanho = tamanho;
        this.material = material;
    }

    @Override
    public void mostraInfo() {

    }
}
