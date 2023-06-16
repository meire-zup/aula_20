package exercicio1_CA;

public class Livro extends  Produto{

    private String autor;

    public Livro(String nome, Double preco, String autor, Long codigoDeBarras) {

        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }
    @Override
    public void mostrarDetalhesDoltem() {

        super.mostrarDetalhesDoltem();
        System.out.println("Autor: "+this.autor);

    }
}
