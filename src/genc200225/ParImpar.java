package genc200225;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        int a, b, resultado;
        Scanner kb = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        a = kb.nextInt();

        if (a % 2 == 0) {

            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
/**
        public class ParImpar {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa un número");
                int a = sc.nextInt();
                String mensaje = (a == 0) ? "El 0 ya es par" : (a%2==0) ? "Ese numero es par" : "Ese numero es impar";
                System.out.println(mensaje);
            }
        }
 **/

