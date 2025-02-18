package genc180225;
//importar clase Scanner desde la libreria de java util
import java.util.Scanner;
//Todos los progamas van a estar compuestos de clases, estas son como celulas de nuestros programas y empiezan con
//mayuscula,el nombre de la case corresponde con el nombre del archivo.
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    // system.out o sout permite imprimir en la consola
    {System.out.println("Hello World");

     //Scanner.next nos permite recibir un input en la consola:
    //Instanciar un a clase
    // se invoca la Class Scanner, la nombramos keyboard, determinamos como nueva instancia con la palabra New.
    // Scaner(System.in nos permitira recibir un dato)

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Hola, como te llamas?");

    String name = keyboard.nextLine();

    System.out.println("Hola " + name);


    }
}
