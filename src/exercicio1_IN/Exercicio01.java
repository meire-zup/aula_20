package exercicio1_IN;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FabricaLampada fabricaLampada = new FabricaLampada();
        Lampada lampada;
        System.out.println("Escolha o tipo de lâmpada que deseja construir (1 para Incandescente e 2 para Fluorescente):");
        int escolha = scanner.nextInt();
        if (escolha == 1){
            lampada = fabricaLampada.construir(new Incandescente("Lâmpada incandescente"));
            System.out.println(lampada.toString());
            System.out.println(lampada.ligar());
            System.out.println(lampada.desligar());


        } else {
            lampada = fabricaLampada.construir(new Fluorescente("Lâmpada fluorescente"));
            System.out.println(lampada.toString());
            System.out.println(lampada.ligar());
            System.out.println(lampada.desligar());


        }
    }
}
