package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 3</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 *
 * Escribe un programa de Java que guarde en variables:<br>
 * - NIF<br>
 * - Nombre<br>
 * - Fecha de nacimiento<br>
 * - Dirección<br>
 * - Código postal y población<br>
 * - Teléfono fijo<br>
 * - Teléfono móvil<br><br>
 * Y luego imprima:<br><br>
 * “El alumno 'Nombre' de NIF 'NIF', nació el 'Fecha de nacimiento' y reside actualmente en
 * 'Dirección','Código Postal','Población'. Sus teléfonos de contactos son: 'Teléfono fijo' y
 * 'Teléfono móvil'”.<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 14/03/2022
 */

public class ejer03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el NIF:");
        String nif = sc.nextLine();
        System.out.println("Introduce el nombre completo:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la fecha de nacimiento (DD/MM/AAAA):");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Introduce la dirección:");
        String direccion = sc.nextLine();
        System.out.println("Introduce el código postal:");
        int codigoPostal = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la población:");
        String poblacion = sc.nextLine();
        System.out.println("Introduce el teléfono fijo:");
        int telFijo = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el teléfono móvil:");
        int telMovil = sc.nextInt();
        sc.nextLine();

        System.out.printf("El alumno %s de NIF %s, nació el %s y reside actualmente en%n%s, %d, %s. Sus teléfonos de contactos son: %d y %d%n",
                nombre, nif, fechaNacimiento, direccion, codigoPostal, poblacion, telFijo, telMovil);
    }

}
