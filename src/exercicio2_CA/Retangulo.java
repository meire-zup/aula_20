package exercicio2_CA;

public class Retangulo extends Forma{

    private Float base;
    private Float altura;

    public Retangulo(Float base, Float altura) {
        super("Retângulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retângulo";
    }

    @Override
    public Float calcularArea() {

        return base * altura;
    }

    @Override
    public Float calcularPerimetro() {

        return (2 * base) + ( 2 * altura);
    }
}
