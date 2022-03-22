package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 20</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>Escribe un programa que lea 2 datos enteros por teclado (a y b) y calcule el área de un triángulo. Al
 * final imprimirá el mensaje:<br>
 * “El triángulo de base < b > y altura < a > tiene un área de < area >”</p>
 * <br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 22/03/2022
 */

public class ejer20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta la base del triángulo:");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Inserte la altura vertical del triángulo:");
        int h = Integer.parseInt(sc.nextLine());
        double a = ((double) b * h) / 2;
        System.out.printf("El triángulo de base %d y altura %d tiene un área de %.4f\n", b, h, a);
    }
}
