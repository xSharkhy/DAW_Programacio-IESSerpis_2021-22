package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 4</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 *
 * Escribe un programa en Java que utilice el valor de una variable numérica para escribir su tabla de
 * multiplicar por pantalla del siguiente modo:<br><br>
 * TABLA DE MULTIPLICAR DE <'var>:<br>
 * < var > x 1 = < var x 1 ><br>
 * < var > x 2 = < var x 2 ><br>
 * < var > x 3 = < var x 3 ><br>
 * < var > x 4 = < var x 4 ><br>
 * < var > x 5 = < var x 5 ><br>
 * < var > x 6 = < var x 6 ><br>
 * < var > x 7 = < var x 7 ><br>
 * < var > x 8 = < var x 8 ><br>
 * < var > x 9 = < var x 9 ><br>
 * < var > x 10 = < var x 10 ><br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 14/03/2022
 */

public class ejer04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println("Tabla de multiplicar de " + x + "\n");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", x, i, (x * i));
        }
    }
}
