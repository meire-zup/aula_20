package exercicio2_IN;
public abstract class Servicos {
    private String nomeDoTitular;
    private String cpf;

    public Servicos(String nomeDoTitular, String cpf) {
        this.nomeDoTitular = nomeDoTitular;
        this.cpf = cpf;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public String getCpf() {

        return cpf;
    }

    public void calcularTaxas(){

    }
}


