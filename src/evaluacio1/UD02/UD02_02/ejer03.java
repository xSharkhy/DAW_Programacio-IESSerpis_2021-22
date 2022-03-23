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

        String nif = "49872415B";
        String nombre = "Perico Fernández";
        String fechaNacimiento = "19/09/2000";
        String direccion = "Calle de la golosina 2, Piruleta";
        int codigoPostal = 54123;
        String poblacion = "Albacete";
        int telFijo = 912345678;
        int telMovil = 678912345;

        System.out.printf("El alumno %s de NIF %s, nació el %s y reside actualmente en%n%s, %d, %s. Sus teléfonos de contactos son: %d y %d%n",
                nombre, nif, fechaNacimiento, direccion, codigoPostal, poblacion, telFijo, telMovil);
    }

}
