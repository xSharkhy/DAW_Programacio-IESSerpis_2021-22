package evaluacio1.UD02.UD02_02;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 13</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa en Java que encuentre la solución al siguiente problema:<br>
 * Patricia, Elena y Oscar van al cine, cuya entrada cuesta 9 € en Kinépolis.<br>
 * -Patricia compra palomitas, que le cuestan 6 €, un refresco por valor de la mitad de lo que le cuestan las
 * palomitas y dulces por el cubo de lo que cuesta el refresco.<br>
 * -Elena pide lo mismo que Patricia.<br>
 * -Oscar solo compra el mismo refresco que ha comprado Patricia.<br>
 * El programa imprimirá un mensaje con el total gastado por los 3 amigos del siguiente modo:<br><br>
 * “Patricia ha gastado < dinero_Patricia > euros”<br>
 * “Elena ha gastado < dinero_Elena > euros”<br>
 * “Oscar ha gastado < dinero_Oscar > euros”<br><br>
 * “En total la broma les ha salido por < dinero_Patricia > + < dinero_Elena > + < dinero_Oscar > euros”.</p><br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 21/03/2022
 */

public class ejer13 {

    public static void main(String[] args) {

        int entrada = 9;
        int palomitas = 6;
        int refresco = palomitas / 2;
        int dulces = refresco * refresco * refresco;

        int patricia = entrada + palomitas + refresco + dulces;
        int elena = patricia;
        int oscar = entrada + refresco;

        System.out.println("Patricia ha gastado " + patricia + " euros.");
        System.out.println("Elena ha gastado " + elena + " euros.");
        System.out.println("Oscar ha gastado " + oscar + " euros.");
        System.out.println("\nEn total, la broma les ha salido por " + (patricia + elena + oscar) + " euros.");
    }
}
