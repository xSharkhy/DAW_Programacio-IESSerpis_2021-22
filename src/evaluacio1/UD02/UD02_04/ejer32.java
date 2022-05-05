package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

public class ejer32 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final double CONVERSOR = 0.27777777777777777777;

        System.out.println("Introduzca el valor a convertir:");
        System.out.printf("Equivale a %.3f m/s", (sc.nextDouble() * CONVERSOR));
    }
}
