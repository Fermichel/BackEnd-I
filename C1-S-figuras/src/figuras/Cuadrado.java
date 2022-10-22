package figuras;

public class Cuadrado extends Figura {

    private final double lado;

    public Cuadrado(double lado) {
        if (lado < 0) {
            throw new NoSePuedeInstanciarUnaFiguraConParametroNegativoError();
        }
        this.lado = lado;
    }

    @Override
    public String calcularPerimetro() {
        double totalLado= lado*4;
        String mje = "El área del cuadrado es "+totalLado+" unidades";
        return mje;
    }
}
