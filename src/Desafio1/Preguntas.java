package Desafio1;

import java.util.Scanner;

public class Preguntas {

    //Usar metodos println() y next() para recibir informacion e imprimirla

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola buenas, como te llamas?");
        String name = teclado.nextLine();

        System.out.println("Hola " + name);

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("En que mes naciste?");
        String mes = teclado2.nextLine();

        System.out.println("Hola " +mes);

        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Genial, que año?");
        int year = teclado3.nextInt();

        System.out.println("Wow en el, " + year + " te veo más joven");
        System.out.println("Ahora ya te conozco bastante" + name + "Nacido en " + mes +" De " + year + "." );
    }

}
