import figuras.Circulo;
import figuras.Figura;
import figuras.NoSePuedeInstanciarUnaFiguraConParametroNegativoError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    private Figura circulo;

    @Test
    public void probar_area_circulo() {
        //Arrange
        Circulo circulo= new Circulo(10);
        //ACT
        String resultado= circulo.calcularPerimetro();
        //Assert
        Assertions.assertEquals("El área del circulo es 62.83185307179586 unidades",resultado);
    }

    }
