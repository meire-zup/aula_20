package exercicio2_IN;

public class ContaCorrente extends Servicos implements Tributos {

    private String numeroConta;

    private Double saldo;
    public ContaCorrente(String nomeDoTitular, String cpf, String numeroConta, Double saldo) {
        super(nomeDoTitular, cpf);
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    @Override
    public Double calcularTributos() {

        return 0.01 * saldo;
    }

    @Override
    public void calcularTaxas() {
        System.out.println("VALOR A SER PAGO DE TAXAS: "+calcularTributos());
    }
}
