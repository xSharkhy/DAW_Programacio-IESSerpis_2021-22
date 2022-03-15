package evaluacio1.UD02.UD02_02;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 2</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 *
 * Escribe un programa de Java que guarde en una variable el valor de tu nombre, en otra variable el valor
 * de tu edad y en otra variable tu altura (en decimales) y luego imprima:<br><br>
 * “Te llamas 'nombre', tienes 'edad' años y mides 'altura' metros. Soy adivino!”<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 14/03/2022
 */

public class ejer02 {
    public static void main(String[] args) {
        String nombre = "Perico";
        int edad = 23;
        float altura = 1.78F;
        System.out.printf("Te llamas %s, tienes %d y mides %.2f metros. Soy adivino!", nombre, edad, altura);
    }
}
