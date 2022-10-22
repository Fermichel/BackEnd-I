import figuras.Cuadrado;
import figuras.Figura;
import figuras.NoSePuedeInstanciarUnaFiguraConParametroNegativoError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuadradoTest {
    private Figura cuadrado;

    @Test
    public void probar_ara_cuadrado() {
        //Arrange
        Cuadrado cuadrado1= new Cuadrado(8);
        //ACT
        String resultado= cuadrado1.calcularPerimetro();
        //Assert
        Assertions.assertEquals("El área del cuadrado es 32.0 unidades",resultado);
    }
}
