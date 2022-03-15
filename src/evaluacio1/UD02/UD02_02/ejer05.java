package evaluacio1.UD02.UD02_02;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 5</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 *
 * Escribe un programa en Java que utilice una estructura del tipo “enum” para escribir los 7 días de la
 * semana por pantalla. Acuérdate que un tipo “enum” hay que declararlos fuera de la clase, al principio
 * de tu fichero .java. Por pantalla se imprimirá:<br>
 *  -- Odio los < primera posición del enum >.<br>
 *  -- Los < segunda posición del enum > paso de la fase de negación a la fase de aceptación.<br>
 *  -- Cuando es < tercera posición del enum > pienso que ya vamos por la mitad de la semana.<br>
 *  -- El previo del Viernes, el < cuarta posición del enum >, es mi día favorito de la semana.<br>
 *  -- El < quinta posición del enum > suelo quedar con mis amigos para cenar.<br>
 *  -- Los < sexta posición del enum > me levanto tarde y siempre desayuno tortitas.<br>
 *  -- Me deprimen los < séptima posición del enum> porque pienso que mañana es < primera posición del enum >.<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 14/03/2022
 */

public class ejer05 {
    enum DIAS {
        LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
    }

    public static void main(String[] args) {
        System.out.println("Odio los " + DIAS.LUNES + ".");
        System.out.println("Los " + DIAS.MARTES + " paso de la fase de negación a la fase de aceptación.");
        System.out.println("Cuando es " + DIAS.MIÉRCOLES + " pienso que ya vamos por la mitad de la semana.");
        System.out.println("El previo del Viernes, el " + DIAS.JUEVES + ", es mi día favorito de la semana.");
        System.out.println("El " + DIAS.VIERNES + " suelo quedar con mis amigos para cenar.");
        System.out.println("Los " + DIAS.SÁBADO + "S me levanto tarde y siempre desayuno tortitas.");
        System.out.println("Me deprimen los " + DIAS.DOMINGO + "S porque pienso que mañana es " + DIAS.LUNES + ".");
    }
}
