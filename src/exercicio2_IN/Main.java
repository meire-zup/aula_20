package exercicio2_IN;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TAXAS DE SERVIÇOS:");
        System.out.println("Informe o tipo de serviço:");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("3 - Seguro De Vida");
        int escolha = scanner.nextInt();
        Servicos servico;
        switch (escolha){
            case 1:
                servico = new ContaCorrente("João da Silva", "000.000.000-00"
                , "23456-78", 856.90);
                servico.calcularTaxas();
                break;
            case 2:
                servico = new ContaPoupanca("João da Silva", "000.000.000-00"
                        , "23456-78", 856.90);
                servico.calcularTaxas();
                break;

            case 3:
                servico = new SeguroDeVida("João da Silva", "000.000.000-00"
                        , "45553", 100000.00);
                servico.calcularTaxas();
                break;

            default:
                System.out.println("VALOR INVÀLIDO!");

        }


    }

}
