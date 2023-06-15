package exercicio1_CA;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        //Instanciando produtos:
        Produto livro1 = new Livro("1984", 80.00, "autor", 123456L);
        Produto cd1 = new Cd("21", 50.90, 5, 123457L);
        Produto dvd = new Dvd("Dvd", 40.00, 55, 123458L);
        Produto livro2 = new Livro("O Senhor dos Anéis", 200.50, "autor", 123459L);
        Produto cd2 = new Cd("Thriller", 75.60, 4, 123450L);

        //Adicionando produtos:

        produtos.add(livro1);
        produtos.add(cd1);
        produtos.add(cd2);
        produtos.add(livro2);
        produtos.add(dvd);

        //Imprimindo produtos:
        for ( Produto produto : produtos) {
            System.out.println("Produto:");
            produto.mostrarDetalhesDoltem();
            System.out.println("********************************");

        }


        System.out.println(produtos.indexOf(livro1));

        Produto produto1 = livro1;
        Produto produto2 = livro2;

        if(produto1.equals(produto2)){
            System.out.println("Produtos são iguais");
        } else {
            System.out.println("Produtos diferentes.");
        }

    }
}