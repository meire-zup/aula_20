package exercicio2_CA;

public class Quadrado extends  Retangulo{

    public Quadrado(Float lado) {
        super(lado, lado);
    }

    @Override
    public Float calcularArea() {
        return super.calcularArea();
    }

    @Override
    public Float calcularPerimetro() {
        return super.calcularPerimetro();
    }

    @Override
    public String toString() {
        return "Quadrado";
    }
}
