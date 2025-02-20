package genc200225;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        //Bucle While da vueltas hasta que se cumpla la condición
        int contador = 10;
        System.out.println("contador de despegue");

        while (contador  > 0) {

            contador--;
            System.out.println(contador);

        }
        System.out.println("DESPEGUEN");

/// ----------------------------------------------------------------------------------------------------------------------------

        //Do-While permite que aunque la condicion sea falsa, el bucle se ejecute al menos una vez

        Scanner kb = new Scanner(System.in);


        /* Do-While permite que aunque la condición sea falsa, el bucle se ejecute al menos una vez, lo que se encuentre
         en el bloque do se ejecutará si o si una vez y el while evaluara la sentecia despúes.
        * */

        System.out.println("Ingrese un numero del 1 al 10: ");
        Integer numeroElegido = Integer.parseInt(kb.nextLine()); // Leer una sola vez

        Integer NumeroMisterioso = (int) (Math.random() * 10) + 1;

        do {
            System.out.println("Escribe un numero del 1 al 10: ");
            contador++;

            if (NumeroMisterioso == numeroElegido) {
                System.out.println("Felicidades, has adivinado!");
                break; // Salir del bucle si acierta
            } else if (NumeroMisterioso < numeroElegido) {
                System.out.println("Número muy alto");
            } else {
                System.out.println("Número muy bajo");
            }

            System.out.println("Intentos: " + contador);
            System.out.println("Intenta de nuevo: ");
            numeroElegido = Integer.parseInt(kb.nextLine()); // Leer el siguiente intento

        } while (numeroElegido != NumeroMisterioso);

        System.out.println("Fin del programa");

        //bucle for

        for (int i = 10; i < 0; i--) { //iniciamos y variable y ponemos condición

            System.out.println(i);

        }
        System.out.println("PUM");

        System.out.println("ingresa numero pa multiplicar");
        Integer numero = kb.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }


        kb.close();

    }
}
