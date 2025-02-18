package genc180225;

public class Operadores {

    public static void main(String[] args) {

        /*Operadores aritmeticos
            + Suma
            - resta
            * Multiplicación
            / Division
            % Lo que queda de la división
        */

        int a = 10;
        int b = 5;
        final int c = 15; //es una constante su valor nopuede cambiar

        int resultado = a + b; //suma

        System.out.println( a + "+" + b + "  es =" + resultado);

        resultado = resultado - a;

        System.out.println( "Ahora que restamos " + a + " al resultado anterior el nuevo resultado es = " + resultado);

        resultado = resultado * b;
        System.out.println(" Ahora lo multiplicamos por " + b + " Esto da como resulutado " + resultado);

        resultado = c / b;

        resultado = 10 % 2;

        System.out.println("El resto de la division" + c + "/" + b + "es: " + resultado);

    }
}
