package Desafio1;

public class Desafio200225 {
    public static void main(String[] args) {
        long fibonacci1 = 0, fibonacci2 = 1, fibonacci3, i, contador = 50;

        for (i = 2; i <= contador; ++i) {

            System.out.println(fibonacci1 + " " + fibonacci2);
            fibonacci3 = fibonacci2 + fibonacci1;
            System.out.println(fibonacci3);
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;

        }

    }
}
