package exercicio1_CA;

public class Cd extends Produto{
    private Integer numeroDeFaixas;

    public Cd(String nome, Double preco, int numeroDeFaixas, Long codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.numeroDeFaixas=numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoltem() {
        super.mostrarDetalhesDoltem();
        System.out.println("Números de faixas: "+this.numeroDeFaixas);
    }



}
