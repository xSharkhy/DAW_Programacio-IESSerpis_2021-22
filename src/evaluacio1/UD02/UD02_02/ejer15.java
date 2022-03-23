package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 15</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa en Java que utilice el valor de una variable numérica real < x > que representará el<br>
 * importe en euros de un producto. También utilizará 3 constantes de IVA General (21%), IVA Reducido<br>
 * (10%) e IVA Superreducido (4%).<br><br>
 * Luego imprimirá lo siguiente:<br>
 * “El importe de tu producto es de “ < x > “euros”.<br>
 * “Si tu producto tuviera un IVA General, su importe descontando el IVA sería : “ < resultado >”.<br>
 * “Si tu producto tuviera un IVA Reducido, su importe descontando el IVA sería: “ < resultado >”.<br>
 * “Si tu producto tuviera un IVA Superreducido, su importe descontando el IVA sería: “< resultado >”.</p><br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 21/03/2022
 */

public class ejer15 {

    public static void main(String[] args) {

        float x = 121F;
        System.out.print("Importe de tu producto: " + x);
        float resultado;
        System.out.println("El importe de tu producto es de " + x + " euros.");
        resultado = x / 1.21F;
        System.out.println("Si tu producto tuviera un IVA General, su importe descontando el IVA sería: " + resultado);
        resultado = x / 1.10F;
        System.out.println("Si tu producto tuviera un IVA Reducido, su importe descontando el IVA sería: " + resultado);
        resultado = x / 1.04F;
        System.out.println("Si tu producto tuviera un IVA Superreducido, su importe descontando el IVA sería: " + resultado);
    }
}
