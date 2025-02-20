package Desafio1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Digite un numero: ");

        int numero = kb.nextInt();

        System.out.println("Digite una operacion: ");

        System.out.println("Digite un numero: ");
        int numero2 = kb.nextInt();

        char operacion = kb.next().charAt(0);

        double resultado = Math.pow(numero, numero2);

        double numeroAleatorio = Math.random();//el numero aleatorio del 0 al 1
        System.out.println(numeroAleatorio);

        int Prueba = Math.max(5 ,10); // el mayor de sos 2

        //Do while menu

        Integer opcion;
        do{
            System.out.println("indica una opción \n 1-Suma\n 2-Resta\n 3-Multiplicacion \n 4-Division");
            System.out.println();
            opcion = kb.nextInt();
        } while (opcion < 0 || opcion > 4);

        kb.close();
    }


}
