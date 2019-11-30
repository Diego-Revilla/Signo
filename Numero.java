/**
 * 
 * La clase numero virificará si un numero es positivo, negativo o cero.
 * @author José Antonio Diego Revilla
 * @version 1.0
 */
//Creación de la clase
public class Numero
{
    /**
     * Método para indicar si el numero que introducimos es +, - ó 0.
     * @param Este parámetro es un numero real
     * @return Retorna un String con el resultado de la evaluación de signo
     */
    public static String signoN(double x){ //Firma del metodo, se abre el método
        //Return con un if incrustado dos veces que evalúa el signo del numero
        return (x > 0)?"Positivo":(x < 0)?"Negativo":"Cero"; 
    } //Cierre del método
} //Cierre de la clase
