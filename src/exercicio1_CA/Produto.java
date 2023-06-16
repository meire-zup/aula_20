package exercicio1_CA;

import java.util.Objects;

public abstract class Produto {

    private String nome;

    private Double preco;

    private Long coodigoDeBarras;

    public Produto(String nome, Double preco, Long coodigoDeBarras) {

        this.nome = nome;
        this.preco = preco;
        this.coodigoDeBarras = coodigoDeBarras;

    }

    public void mostrarDetalhesDoltem() {

        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Código de Barras: " + this.coodigoDeBarras);
        System.out.println("Preço do produto: " + this.preco);
    }

    public Long getCoodigoDeBarras() {

        return coodigoDeBarras;

    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Produto) {

            Produto produtoQualquer = (Produto) o;

            return this.coodigoDeBarras.equals(produtoQualquer.getCoodigoDeBarras());

        } else  {

            return false;

        }
    }

}





