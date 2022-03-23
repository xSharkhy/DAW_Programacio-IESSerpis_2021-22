package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 14</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa en Java que utilice el valor de 2 variables numéricas < a > y < b > e imprima
 * mensajes del siguiente modo:<br><br>
 * “Vamos a utilizar las variables < a > y < b >”<br>
 * “Si < a > fuera la altura y < b > la base de un triángulo, el área de ese triángulo sería < resultado >”.<br>
 * “Si < a > fuera un lado de un cuadrado, su área sería < resultado >”.<br>
 * “Si < a > fuera un radio de un círculo, su área sería < resultado >”.</p><br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 21/03/2022
 */

public class ejer14 {

    public static void main(String[] args) {

        int a = 3, b = 5;
        System.out.print("Variable A: " + a);
        System.out.print("Variable B: " + b);

        float resultado;
        System.out.println("Vamos a utilizar las variables " + a + " y " + b + ":");
        resultado = b * (a / 2F);
        System.out.println("Si " + a + " fuera la altura y " + b + " la base de un triángulo, el área de ese triángulo sería: " + resultado);
        resultado = a * a;
        System.out.println("Si " + a + " fuera un lado de un cuadrado, su área sería: " + resultado);
        resultado = (float) (Math.PI * a);
        System.out.println("Si " + a + " fuera un radio de un círculo, su área sería: " + resultado);
    }
}
