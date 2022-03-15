package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 10</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 *
 * Escribe un programa en Java que utilice el valor de 2 variables enteras que contendrán el número de
 * niños y de niñas matriculados en un colegio.<br>
 * Se encargará de imprimir el porcentaje de niños y de niñas matriculados en el curso de la forma:
 * “Tenemos matriculados < num_niños > niños y < num_niñas > niñas. En total, tenemos mariculados
 * < num_total > alumnos, siendo un < porcentaje1 > perteneciente a los niños y < porcentaje2 >
 * perteneciente a las niñas”.<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 15/03/2022
 */

public class ejer10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("El número de niños matriculados es: ");
        int a = sc.nextInt();
        System.out.print("El número de niñas matriculados es: ");
        int b = sc.nextInt();
        int total = a + b;
        float pa = (float) a * 100 / total;
        float pb = (float) b * 100 / total;

        System.out.println("\nTenemos matriculados " + a + " niños y " + b + " niñas. En total, tenemos\n" +
                "matriculados " + total + " alumnos, siendo un " + pa + "% perteneciente a\n" +
                "los niños y " + pb + "% perteneciente a las niñas.");
    }
}
