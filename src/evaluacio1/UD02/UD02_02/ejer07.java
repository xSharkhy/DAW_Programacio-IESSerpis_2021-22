package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 7</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br><br>
 *
 * Escribe un programa en Java que utilice 2 variables numéricas de modo que imprimirá:<br>
 * “Al principio del programa, el valor de a es “< a >” y el valor de b es “< b >.<br>
 * Luego, intercambiará las 2 variables e imprimirá:<br>
 * “Después del intercambio, el valor de a es “< a >” y el valor de b es “< b >.<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 15/03/2022
 */

public class ejer07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Variable A: ");
        int a = sc.nextInt();
        System.out.print("Variable B: ");
        int b = sc.nextInt();

        System.out.println("Al principio del programa, el valor de a es " + a + " y el valor de b es " + b);
        int aux = a;
        a = b;
        b = aux;

        System.out.println("Después del intercambio, el valor de a es " + a + " y el valor de b es " + b);
    }
}
