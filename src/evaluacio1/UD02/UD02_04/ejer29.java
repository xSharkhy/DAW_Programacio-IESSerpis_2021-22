package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

public class ejer29 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase para pasarla a Mayúsculas:");
        String frase = sc.nextLine();
        System.out.println("Tu frase en minúsculas es: \t\t" + frase);
        System.out.println("Y en MAYÚSCULAS es:\t\t\t\t" + frase.toUpperCase());
    }
}
