package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 25</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa que lea los valores de 2 catetos de un triángulo y devuelva el valor de la
 * hipotenusa aplicando el teorema de Pitágoras:<br><br>
 * <img src="../../../sources/Image_5.png" alt="Factura.png"/>
 * </p>
 * <br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 22/03/2022
 */

public class ejer25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta valor de 'a':");
        double lado1 = sc.nextDouble();
        System.out.println("Inserta valor de 'b':");
        double lado2 = sc.nextDouble();
        double hipo = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        System.out.println("El valor de la hipotenusa es " + hipo);
        sc.close();
    }
}
