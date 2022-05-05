package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

public class ejer31 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca valor de N: ");
        String N = sc.nextLine();
        for (int i = 0; i < 3; i++) System.out.printf("Cifra n.%d -> %s%n", i + 1, N.charAt(i));
    }
}
