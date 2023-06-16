package exercicio1_CA;

public class Dvd extends Produto{

    private Integer duracao;

    public Dvd(String nome, Double preco, Integer duracao, Long codigoDeBarras) {

        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }
    @Override
    public void mostrarDetalhesDoltem() {

        super.mostrarDetalhesDoltem();
        System.out.println("Duração: "+this.duracao);

    }


}
