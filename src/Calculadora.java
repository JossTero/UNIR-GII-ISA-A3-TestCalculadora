/**
 * Funcionalidad de calculadora. Operaciones:
 *  - Sumar
 *  - Restar
 *  - Multiplicar
 *  - Dividir
 *  - Raíz cuadrada
 */
public final class Calculadora {
    
    /**
     * Constructor vacío
     */
    private Calculadora(){
    }

    /**
     * Operación aritmética de sumar dos números reales
     * 
     * @param sumando1              : Primer sumando
     * @param sumando2              : Segundo sumando sumando
     * @return                      : El total de la suma
     */
    public static double sumar(double sumando1, double sumando2){
        return sumando1 + sumando2;
    }

    /**
     * Operación aritmética de restar dos números reales
     * 
     * @param minuendo              : El minuendo
     * @param subtraendo            : El subtraendo
     * @return                      : El diferencia de la resta
     */
    public static double restar(double minuendo, double subtraendo){
        return minuendo - subtraendo;
    }

    /**
     * Operación aritmética de multiplicar dos números reales
     * 
     * @param multiplicando         : El multiplicando
     * @param multiplicador         : El multiplicador
     * @return                      : El producto de la multiplicación
     */
    public static double multiplicar(double multiplicando, double multiplicador){
        return multiplicando * multiplicador;
    }

    /**
     * Operación aritmética de dividir dos números reales
     * 
     * @param dividendo             : El dividendo
     * @param divisor               : El divisor
     * @return                      : El cociente de la división
     */
    public static double dividir(double dividendo, double divisor){
        return 0;
    }

    /**
     * Operación aritmética de ráiz cuadrada dos números reales
     * 
     * @param cantidadSubradical    : La cantidad subradical
     * @param delta                 : La precisión mínima para dar por válida el resultado
     * @return                      : La raíz
     */
    public static double raizCuadrada(double cantidadSubradical){
        return 0;
    }    
}

