package exercicio2_CA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teste {
    public static void main(String[] args) {

        Set<Forma> formas = new HashSet<>(5);

        Forma retangulo1 = new Retangulo(4F, 2F);
        Forma quadrado1 = new Quadrado(4F);
        Forma circulo1 = new Circulo(5F);
        Forma retangulo2 = new Retangulo(6F, 3F);
        Forma quadrado2 = new Quadrado(8F);

        formas.add(retangulo1);
        formas.add(retangulo2);
        formas.add(quadrado1);
        formas.add(quadrado2);
        formas.add(circulo1);

        for (Forma forma : formas) {
            System.out.println("Figura geométrica:"+forma);
            System.out.println("ÁREA: "+forma.calcularArea());
            System.out.println("PERÍMETRO: " +forma.calcularPerimetro());
            System.out.println("********************************");
        }

    }
}
