
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

   
    /**
     * Prueba con numeros positivos, positivo y negativo, negativo y positivo y negativos
     */
    @Test
    public void testSuma(){
        //arrange global
        double delta = 0.001; // 10^-3
        
        /*
         * PRUEBA POSITIVOS
         */
        //arrange
        double entrada1 = 10.0;
        double estrada2 = 12.0;
        double resultadoEsperado = 22.0;

        //act
        double resultado = 0.0; // Pendiente de desarrollo

        //assert
        String mensajeError = "Error en TEST de suma porque el resultado esperado era " + entrada1 + "+" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA POSITIVO Y NEGATIVO
         */
        //arrange
        entrada1 = 15.3;
        estrada2 = -14.3;
        resultadoEsperado = 1.0;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de suma porque el resultado esperado era " + entrada1 + "+" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA NEGATIVO Y POSITIVO
         */
        //arrange
        entrada1 = -10.2;
        estrada2 = 2.1;
        resultadoEsperado = -8.1;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de suma porque el resultado esperado era " + entrada1 + "+" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA NEGATIVOS
         */
        //arrange
        entrada1 = -87.2;
        estrada2 = -25.1;
        resultadoEsperado = -112.3;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de suma porque el resultado esperado era " + entrada1 + "+" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);
    }

    /**
     * Prueba con numeros positivos, positivo y negativo, negativo y positivo y negativos
     */
    @Test
    public void testResta(){
        //arrange global
        double delta = 0.001; // 10^-3
        
        /*
         * PRUEBA POSITIVOS
         */
        //arrange
        double entrada1 = 7.0;
        double estrada2 = 5.0;
        double resultadoEsperado = 2.0;
        

        //act
        double resultado = 0.0; // Pendiente de desarrollo

        //assert
        String mensajeError = "Error en TEST de resta porque el resultado esperado era " + entrada1 + "-" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA POSITIVO Y NEGATIVO
         */
        //arrange
        entrada1 = 5.3;
        estrada2 = -7.5;
        resultadoEsperado = 12.8;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de resta porque el resultado esperado era " + entrada1 + "-" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA NEGATIVO Y POSITIVO
         */
        //arrange
        entrada1 = -33.3;
        estrada2 = 7.25;
        resultadoEsperado = -40.55;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de resta porque el resultado esperado era " + entrada1 + "-" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA NEGATIVOS
         */
        //arrange
        entrada1 = -25.33;
        estrada2 = -25.33;
        resultadoEsperado = 0.0;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de resta porque el resultado esperado era " + entrada1 + "-" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);
    }

    /**
     * Prueba con numeros positivos, positivo y negativo, negativo y positivo y negativos
     */
    @Test
    public void testMultiplicacion(){
        //arrange global
        double delta = 0.001; // 10^-3
        
        /*
         * PRUEBA POSITIVOS
         */
        //arrange
        double entrada1 = 7.85;
        double estrada2 = 10;
        double resultadoEsperado = 78.5;

        //act
        double resultado = 0.0; // Pendiente de desarrollo

        //assert
        String mensajeError = "Error en TEST de multiplicación porque el resultado esperado era " + entrada1 + "*" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA POSITIVO Y NEGATIVO
         */
        //arrange
        entrada1 = 3.3;
        estrada2 = -24.3;
        resultadoEsperado = -80.19;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de multiplicación porque el resultado esperado era " + entrada1 + "*" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA NEGATIVO Y POSITIVO
         */
        //arrange
        entrada1 = -5.0;
        estrada2 = 5.0;
        resultadoEsperado = -25.0;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de multiplicación porque el resultado esperado era " + entrada1 + "*" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA NEGATIVOS
         */
        //arrange
        entrada1 = -99.7;
        estrada2 = -15.3;
        resultadoEsperado = 1525.41;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de multiplicación porque el resultado esperado era " + entrada1 + "*" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);
    }

    /**
     * Prueba con numeros positivos, positivo y negativo, negativo y positivo, negativos, positivo entre cero, negativo entre cero y cero entre cero
     */
    @Test
    public void testDivision(){
        //arrange global
        double delta = 0.001; // 10^-3
        
        /*
         * PRUEBA POSITIVOS
         */
        //arrange
        double entrada1 = 25.25;
        double estrada2 = 7.33;
        double resultadoEsperado = 3.4447;

        //act
        double resultado = 0.0; // Pendiente de desarrollo

        //assert
        String mensajeError = "Error en TEST de división porque el resultado esperado era " + entrada1 + "/" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA POSITIVO Y NEGATIVO
         */
        //arrange
        entrada1 = 100.3;
        estrada2 = -12.5;
        resultadoEsperado = -8.024;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de división porque el resultado esperado era " + entrada1 + "/" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA NEGATIVO Y POSITIVO
         */
        //arrange
        entrada1 = -87.25;
        estrada2 = 3.1;
        resultadoEsperado = -28.1452;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de división porque el resultado esperado era " + entrada1 + "/" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA NEGATIVOS
         */
        //arrange
        entrada1 = -33.5;
        estrada2 = -33.5;
        resultadoEsperado = 1.0;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de división porque el resultado esperado era " + entrada1 + "/" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA POSITIVO DIVISIÓN ENTRE CERO
         */
        //arrange
        entrada1 = 25.0;
        estrada2 = 0;
        resultadoEsperado = Double.POSITIVE_INFINITY;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de división porque el resultado esperado era " + entrada1 + "/" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);
    
        /*
         * PRUEBA NEGATIVO DIVISIÓN ENTRE CERO
         */
        //arrange
        entrada1 = -13.13;
        estrada2 = 0;
        resultadoEsperado = Double.NEGATIVE_INFINITY;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de división porque el resultado esperado era " + entrada1 + "/" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

         /*
         * PRUEBA CERO DIVISIÓN ENTRE CERO
         */
        //arrange
        entrada1 = 0;
        estrada2 = 0;
        resultadoEsperado = Double.NaN;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de división porque el resultado esperado era " + entrada1 + "/" + estrada2 + "=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);
    }
    

    /**
     * Prueba con numero positivo, negativo y cero
     */
    @Test
    public void testRaizCuadrada(){
        //arrange global
        double delta = 0.001; // 10^-3
        
        /*
         * PRUEBA POSITIVO
         */
        //arrange
        double entrada = 25.25;
        double resultadoEsperado = 5.0249;

        //act
        double resultado = 0.0; // Pendiente de desarrollo

        //assert
        String mensajeError = "Error en TEST de raíz cuadrada porque el resultado esperado era sqrt(" + entrada + ")=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

         /*
         * PRUEBA NEGATIVO
         */
        //arrange
        entrada = -16;
        resultadoEsperado = Double.NaN;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de raíz cuadrada porque el resultado esperado era sqrt(" + entrada + ")=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);

        /*
         * PRUEBA RAÍZ ENTRE CERO
         */
        //arrange
        entrada = 0.0;
        resultadoEsperado = 0.0;

        //act
        resultado = 0.0; // Pendiente de desarrollo

        //assert
        mensajeError = "Error en TEST de raíz cuadrada porque el resultado esperado era sqrt(" + entrada + ")=" + resultadoEsperado + " y es " + resultado;
        assertEquals(mensajeError, resultadoEsperado, resultado, delta);
    }
}
