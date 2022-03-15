package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 9</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa en Java que utilice el valor de una variable entera para almacenar la edad del
 * usuario.<br>
 * -- Luego, dividirá el año del descubrimiento de América por esa < edad >.<br>
 * -- Al cociente se le restará el número de grand slams ganados por Nadal.<br>
 * -- El resultado de la resta anterior es el cuadrado del número secreto.<br>
 * -- Imprimirá por pantalla “El número secreto es...” < resultado >.<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 15/03/2022
 */

public class ejer09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu edad!: ");
        int e = sc.nextInt();
        e = 1492 / e;
        e -= 21;
        e *= e;
        System.out.println("El número secreto es... " + e);
    }
}
