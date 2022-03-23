package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 22</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa que, dado el número de clase del alumno, el nombre completo y la nota de 3
 * exámenes calcule la nota media y muestre la información del siguiente modo:<br>
 * <p  style="font-family: monospace;">Introduzca número de estudiante:</p>
 * <p  style="font-family: monospace;color=green;">23</p>
 * <p  style="font-family: monospace;">Introduzca nombre del alumno:</p>
 * <p  style="font-family: monospace;color=green;">Francisco Pérez</p>
 * <p  style="font-family: monospace;">Introduzca nota 1:</p>
 * <p  style="font-family: monospace;color=green;">5,5</p>
 * <p  style="font-family: monospace;">Introduzca nota 2:</p>
 * <p  style="font-family: monospace;color=green;">8,7</p>
 * <p  style="font-family: monospace;">Introduzca nota 3:</p>
 * <p  style="font-family: monospace;color=green;">6,3</p>
 * <pre style="font-family: monospace;">Alumno: 23 - Francisco Pérez        ex.1    ex.2    ex.3    media</pre>
 * <pre style="font-family: monospace;">Notas 1era evaluación:              4,00    7,00    9,00    6,67</pre>
 * </p>
 * <br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 22/03/2022
 */

public class ejer22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca número de estudiante:");
        byte numEstudiante = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca nombre del alumno:");
        String nombreEstudiante = sc.nextLine();

        double nota1, nota2, nota3, average;
        System.out.println("Introduzca TRES notas, pulse ENTER entre cada una:");
        System.out.print("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        nota3 = sc.nextDouble();
        average = (nota1 + nota2 + nota3) / 3;
        System.out.printf("\nAlumno %d - %-32sex.1\tex.2\tex.3\tmedia\n", numEstudiante, nombreEstudiante);
        System.out.printf("Notas 1era evaluación:\t\t\t\t\t\t%.2f \t%.2f \t%.2f\t%.2f\n", nota1, nota2, nota3, average);
    }
}
