package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 22</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa que, pida al usuario una serie de datos y devuelva un informe. En concreto pedirá:<br>
 * <pre style="font-family: sans-serif;">       - Fecha de nacimiento en formato AAAA MM DD</pre>
 * <pre style="font-family: sans-serif;">       - NIF</pre>
 * <pre style="font-family: sans-serif;">       - Nombre</pre>
 * <pre style="font-family: sans-serif;">       - Dirección</pre>
 * <pre style="font-family: sans-serif;">       - Salario bruto</pre>
 * <pre style="font-family: sans-serif;">       - Retención</pre><br>
 * <p>
 * Un ejemplo de ejecución sería el siguiente:<br>
 * <img src="../../../sources/Image_3.png"><br>
 * A lo que el programa devolverá el siguiente informe:<br><br>
 * <img src="../../../sources/Image_4.png"><br>
 * </p>
 * <br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 22/03/2022
 */

public class ejer23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca decha de nacimiento en formato AAAA MM DD:");
        int anyo = input.nextInt();
        int mes = input.nextInt();
        int dia = input.nextInt();

        System.out.println("Introduzca NIF:");
        int nif = input.nextInt();
        input.nextLine();

        System.out.println("Introduzca nombre");
        String nombre = input.nextLine();

        System.out.println("Introduzca dirección:");
        String dir = input.nextLine();

        System.out.println("Introduzca salario:");
        double salario = input.nextDouble();

        System.out.println("Introduzca retención:");
        int ret = input.nextInt();
        input.nextLine();

        System.out.println("\nINFORME DEL TRABAJADOR");
        System.out.println("--------------------------------------------------------");
        System.out.println("Nombre..........................:  " + nombre);
        System.out.println("Dirección.......................:  " + dir);
        System.out.println("\nNIF.............................:  " + nif);
        System.out.println("Fecha de nacimiento.............:  " + dia + " del mes " + mes + " del año " + anyo);
        System.out.println("\nSalario bruto...................:  " + salario);
        System.out.println("Retencion.......................:  " + ret + "%");
        System.out.println("Salario neto....................:  " + String.format("%.2f", (salario - (salario / 100 * 16))));
        System.out.println("--------------------------------------------------------");
    }
}
