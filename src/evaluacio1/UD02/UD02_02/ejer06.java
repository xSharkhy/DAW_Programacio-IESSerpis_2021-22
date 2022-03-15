package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 6</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 *
 * Escribe un programa en Java que utilice el valor de 3 variables enteras a, b y c y calcule el valor de x
 * dentro de la fórmula de una ecuación de segundo grado.<br>
 * Al finalizar el programa, imprimirá:<br>
 * “El valor de x siendo a = “ < a > “ b = “ < b > “ y c = “ < c > “ es igual a “ < x > ”.<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 14/03/2022
 */

public class ejer06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta valor de 'a':");
        double a;
        while (true) {
            a = sc.nextDouble();
            if (a != 0) break;
            else System.out.println("Eso traería problemas... Inserta un valor distinto a 0.");
        }
        System.out.println("Inserta valor de 'b':");
        double b = sc.nextDouble();
        System.out.println("Inserta valor de 'c':");
        double c = sc.nextDouble();
        sc.close();

        if (b >= 0 && c >= 0) System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        else if (b < 0 && c >= 0) System.out.println(a + "x^2 " + b + "x + " + c + " = 0");
        else if (b >= 0 && c < 0) System.out.println(a + "x^2 + " + b + "x " + c + " = 0");
        else if (b < 0 && c < 0) System.out.println(a + "x^2 " + b + "x " + c + " = 0");

        double radical = Math.pow(b, 2) - 4.0 * a * c;
        if (radical > 0.0) {
            double raiz1 = (-b + Math.sqrt(radical)) / (2.0 * a);
            double raiz2 = (-b - Math.sqrt(radical)) / (2.0 * a);
            System.out.println("Valores de las raíces para los valores introducidos son " + raiz1 + " y " + raiz2);
        } else if (radical == 0.0) {
            double raiz = -b / (2.0 * a);
            System.out.println("La raíz es: " + raiz);
        } else System.out.println("La respuesta contiene números imaginarios.");
    }
}
