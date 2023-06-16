package exercicio1_IN;

public class Incandescente implements Lampada{

    private String nome;

    @Override
    public String toString() {
        return "Incandescente{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Incandescente(String nome) {
        this.nome = nome;
    }

    @Override
    public String ligar() {

        return "Ligando lâmpada incandescente";

    }

    @Override
    public String desligar() {

        return "Desligando lâmpada incandescente";

    }
}
