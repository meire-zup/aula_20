package exercicio2_CA;

public abstract class Forma {

    private  String nome;

    public Forma(String nome) {

    }

    public abstract Float calcularArea();
    public abstract Float calcularPerimetro();

    @Override
    public String toString() {

        return nome;
    }
}

