package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 11</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa en Java que lea el valor de 2 variables que corresponderán a la altura en
 * centímetros y el peso en gramos del usuario y calcule el IMC con la fórmula:<br><br>
 * IMC = peso(Kg) / altura(m)<sup>2</sup><br><br>
 * Cuando se efectúe el cálculo, se imprimirá el IMC de la forma:<br><br>
 * “El IMC calculado es < imc >”<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 15/03/2022
 */

public class ejer11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu peso en gramos: ");
        float peso = sc.nextInt() / 1000F;
        System.out.print("Introduce tu altura en centímetros: ");
        float altura = sc.nextInt() / 100F;
        int imc = (int) (peso / Math.pow(altura, 2));
        System.out.println("El IMC calculado es " + imc);
    }
}
