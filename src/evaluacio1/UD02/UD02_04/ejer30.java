package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

public class ejer30 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double nota = sc.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double deseo = sc.nextDouble();
        double t = (deseo - 0.4 * nota) / 0.6;
        System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen.\n", deseo, t);
    }
}
