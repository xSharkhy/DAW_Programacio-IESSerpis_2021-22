package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 17</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa que sume, reste, multiplique y divida 2 números introducidos por teclado.<br>
 * Mostrar la información de la siguiente forma:</p><br>
 * <p  style="font-family: monospace;">Introduce x:</p>
 * <p  style="font-family: monospace;color=green;">25</p>
 * <p  style="font-family: monospace;">Introduce y:</p>
 * <p  style="font-family: monospace;color=green;">4</p>
 * <p  style="font-family: monospace;">Los valores introducidos son: 25 y 4</p>
 * <pre style="font-family: monospace;">                SUMA    RESTA   PRODUCTO        COCIENTE</pre>
 * <p  style="font-family: monospace;">--------------------------------------------------------</p>
 * <pre style="font-family: monospace;">x=25y=4         29      21      100             6</pre>
 * <p  style="font-family: monospace;">--------------------------------------------------------</p>
 * <br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 22/03/2022
 */

public class ejer17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sep = "--------------------------------------------------------";

        System.out.println("Introduce el primer valor entero:");
        int x = sc.nextInt();
        System.out.println("Introduce el segundo valor entero:");
        int y = sc.nextInt();
        System.out.println("Los valores introducidos son: " + x + " y " + y);

        int suma = x + y;
        int resta = x - y;
        int producto = x * y;
        float cociente = (float) x / y;

        System.out.println(sep);
        System.out.println("\t\t\t\tSUMA\tRESTA\tPRODUCTO\t\tCOCIENTE");
        System.out.println(sep);
        System.out.printf("x=%dy=%d\t\t\t%d\t\t%d\t\t%d\t\t\t\t%.2f%n", x, y, suma, resta, producto, cociente);
        System.out.println(sep);
    }
}

/*
Mi versión! ->

        System.out.println("Introduce el primer valor entero:");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el segundo valor entero:");
        int y = Integer.parseInt(sc.nextLine());
        System.out.println("Los valores introducidos son " + x + " y " + y);
        int suma = x + y;
        int resta = x - y;
        int producto = x * y;
        double cociente = (double) x / y;
        String separadorAbsurdo = "#####################################################################################";
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-10s# %-16s# %-16s# %-16s# %-16s#\n", "OPERACIÓN", "SUMA", "RESTA", "PRODUCTO", "COCIENTE");
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-4s%-6d# %-16d# %-16d# %-16d# %-16.3f#\n", "x = ", x, suma, resta, producto, cociente);
        System.out.printf("# %-4s%-6d# %-64s#\n", "y = ", y, "                #                 #                 #                 ");
        System.out.println(separadorAbsurdo);
 */
