package exercicio1_CA;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        //Instanciando produtos:
        Produto livro1 = new Livro("Domain-Driven Design: Atacando as complexidades no coração do software", 95.99, "Eric Evans", 123456L);
        Produto cd1 = new Cd("Bohemian Rhapsody - The Original Soundtrack", 49.90, 22, 123457L);
        Produto dvd = new Dvd("Game of Thrones - a Série Completa [DVD]", 429.64, 4216, 123477L);
        Produto livro2 = new Livro("Java®: Como Programar", 397.50, "Paulo Deitel/ Harvey Deitel", 123459L);
        Produto cd2 = new Cd("Thriller", 75.60, 4,123450L);
        Produto livro3 = new Livro("Domain-Driven Design: Atacando as complexidades no coração do software", 95.99, "Eric Evans", 123456L);
        Produto cd3 = new Cd("Bohemian Rhapsody - The Original Soundtrack", 49.90, 22, 123457L);

        //Adicionando produtos:

        produtos.add(livro1);
        produtos.add(cd1);
        produtos.add(cd2);
        produtos.add(livro2);
        produtos.add(dvd);
        produtos.add(livro3);
        produtos.add(cd3);

        //Imprimindo produtos:

        for ( Produto produto : produtos) {
            System.out.println("Produto:");
            produto.mostrarDetalhesDoltem();
            System.out.println("********************************");

        }

        // Comparando produtos:

        System.out.println("COMPARANDO PRODUTOS:");
        compararProdutos(livro1, livro3);
        System.out.println("********************************");

        // Buscando produto:

        System.out.println("BUSCANDO PRODUTOS:");
        buscarProduto(produtos,123477L);

    }

    public static void compararProdutos(Produto produto1, Produto produto2){

        if(produto1.equals(produto2)){

            System.out.println("Produtos são iguais");

        } else {

            System.out.println("Produtos diferentes.");
        }
    }

    public static void buscarProduto(List<Produto> produtos, Long codigoDeBarras){

        for (Produto produto : produtos) {

            if(produto.getCoodigoDeBarras().equals(codigoDeBarras)){

                System.out.println("Produto encontrado na posição: "+produtos.indexOf(produto));
            }

        }

    }
}

