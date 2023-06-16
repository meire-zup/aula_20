package exercicio1_IN;

public class Fluorescente implements Lampada{
    private String nome;

    @Override
    public String toString() {
        return "Fluorescente{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Fluorescente(String nome) {
        this.nome = nome;
    }

    @Override
    public String ligar() {
        return "Ligando lâmpada fluorescente";
    }

    @Override
    public String desligar() {

        return  "Desligando lâmpada fluorescente";

    }
}
