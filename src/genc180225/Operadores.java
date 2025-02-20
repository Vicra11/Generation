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

        /// operadores de asignación -> -= += *= /=

        resultado += 2;

        System.out.println("El resultado +2 equivale a: " + resultado);


        resultado -= 1;

        System.out.println("El resultado -1 equivale a: " + resultado);

        //operador unitario

        //resultado ++;

        System.out.println("El resultado +1 equivale a: " + ++resultado);

        ++resultado;
        System.out.println("El resultado +1 equivale a: " + resultado++);

        System.out.println("El resultado +1 equivale a: " + resultado);

        /// operadores de comparación == Igual < Menor que > Mayor que >=Menor igual  <=Mayor igual  != distinto

        boolean esVerdadero = resultado == a;

        a = 10;
        b = 15;

        System.out.println("El resultado es: " + resultado + "? =" + esVerdadero);
        System.out.println("Es menor que?: " + b + "? =" + (a < b));
        System.out.println("Es mayor que?: " + b + "? =" + (a > b));
        System.out.println("Es distinto?: " + b + "! =" + (a != b));

        ///  operadores logicos || pipe o logico ! negación && doble ampresand y logico

        boolean expresion1 = (a < b) && (a == b); //a es menor que b? y a es igual a a? v+v=v
        System.out.println("El resultado es:" + expresion1);

        boolean expresion2 = (a < b) && (a > b); // es a menor que b y a mayor que b? v + f = f
        System.out.println("El resultado es:" + expresion2);

        boolean expresion3 = (a > b) || (a != b);//a es mayor que b o a es distinto de b, f + v = v
        System.out.println("El resultado es:" + expresion3);

        boolean expresion4 = !(a == b) || !(a < b);//A (no) es igual a b o A (no) es menor que b
        System.out.println("El resultado de :" + expresion4);

    }
}
