package exercicio1_IN;

public class FabricaLampada {
    private Incandescente lampadaIncandescente;

    private Fluorescente lampadaFluorescente;

    public Lampada construir(Lampada tipoLampada){
        System.out.println("Você construiu uma lâmpada.");

        return tipoLampada;
    }


}
