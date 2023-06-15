package exercicio2_CA;

public class Circulo extends Forma{

    private Float raio;
    float pi = (float) Math.PI;

    public Circulo(Float raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public Float calcularArea() {

       return  pi * raio * raio;

    }
    @Override
    public String toString() {
        return "Círculo";
    }

    @Override
    public Float calcularPerimetro() {

        return 2 * pi * raio;
    }
}
