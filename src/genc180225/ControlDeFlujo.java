package genc180225;

import javax.management.NotCompliantMBeanException;
import java.util.Scanner;

public class ControlDeFlujo {
    public static void main(String[] args) {

        //if, else, else if

        Scanner kb = new Scanner(System.in);

        System.out.println("pon un nombre");
        String nombre = kb.nextLine();

        System.out.println("ingresa tu edad");
        Integer edad = kb.nextInt();
        kb.nextLine();

        System.out.println("tienes carnet");
        String Carnet = kb.nextLine();

        System.out.println("Que día de la semana es?");
        Integer DiaSemana = kb.nextInt();


        if (Carnet.equals("si")) {
            if (edad >= 25) {

                System.out.println("Piola " + nombre + " " + edad + " pase al carrete tatita");
            } else if (edad >= 18) {

                System.out.println("Piola " + nombre + " " + edad + " pase al carrete");
            } else {

                System.out.println("Callao pendejo de " + edad + " anda a lahar!!!");


            }
        }else{
            System.out.println("Sin carnet no pasas mano");
        }

        //Una alternativa puede ser switchcase
        switch (DiaSemana){
            case 1:
                System.out.println("hoy comienza la semana");
                break;
            case 2:
                System.out.println("es martes");
                break;
            case 3:
                System.out.println("es miercoles");
                break;
            case 4:
                System.out.println("es jueves");
                break;
            case 5:
                System.out.println("es viernes");
                break;
            case 6:
                System.out.println("es sabado");
                break;
            case 7:
                System.out.println("Se viene lunes");
                break;
            default:
                System.out.println("que de que?");
        }

        System.out.println("Quien te invito?");

        kb.nextLine();
        String InvitadoDe = kb.nextLine();


        switch (InvitadoDe){
            case "Gabriel":
                System.out.println("Grande gabriel ");
                break;
            case "Belen":
                System.out.println("Grande belen ");
                break;
            case "Juan":
                System.out.println("Grande juan ");
                break;
            case "July":
                System.out.println("Grande july ");
                break;
            default:
                System.out.println("Para que mientes?");
        }


    }
}
