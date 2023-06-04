
import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Pruebas de TESTs para las operaciones aritméticas de la funcionalidad calcularora
 */

public final class CalculadoraTests {
    
    /*
     * Constructor vacío
     */
    public CalculadoraTests(){
    }

    @Test
    public void testSuma(){
        assertEquals("Error en TEST de suma de 0+0=10", 10, 0, 0);
    }

    @Test
    public void testMultiplicacion(){
        assertEquals("Error en TEST de multiplicación de 0*0=10", 10, 0, 0);
    }

    @Test
    public void testRaizCuadrada(){
        assertEquals("Error en TEST de suma de sqrt(0)=10", 10, 0);
    }
}
