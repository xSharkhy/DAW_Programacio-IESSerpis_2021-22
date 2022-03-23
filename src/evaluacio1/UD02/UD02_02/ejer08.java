package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 8</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 *
 * Escribe un programa en Java que utilice 2 variables enteras, de modo que imprimirá:<br>
 * “Bienvenido a mi calculadora”.<br>
 * “El valor de a es : “ < a ><br>
 * “El valor de b es : “< b ><br>
 * “a + b = “ < a + b ><br>
 * “a – b = “ < a – b ><br>
 * “a x b = “ < a x b ><br>
 * “a / b = “ < a / b ><br>
 * “a % b = “ < a % b ><br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 15/03/2022
 */

public class ejer08 {

    public static void main(String[] args) {

        System.out.println("Bienvenido a mi calculadora.");

        int a = 5, b = 4;
        System.out.print("El valor de 'a' es: " + a);
        System.out.print("El valor de 'b' es: " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}
