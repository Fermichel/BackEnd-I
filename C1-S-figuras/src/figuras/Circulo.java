package figuras;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        if (radio < 0) {
            throw new NoSePuedeInstanciarUnaFiguraConParametroNegativoError();
        }
        this.radio = radio;
    }



    @Override
        public String calcularPerimetro() {
        double totalArea= 2 * Math.PI * radio;
        String mje = "El área del circulo es "+totalArea+" unidades";
        return mje;
    }
}
