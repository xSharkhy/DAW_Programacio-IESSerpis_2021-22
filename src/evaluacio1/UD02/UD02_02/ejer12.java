package evaluacio1.UD02.UD02_02;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 12</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Escribe un programa en Java que lea de varias variables el numero de votos en unas elecciones:<br>
 * < votos_podemos >, < votos_psoe >, < votos_pp >, < votos_ciudadanos >, < votos_vox ><br><br>
 * Y los agrupe del siguiente modo:<br>
 * < grupo_izquierda > = Podemos + PSOE<br>
 * < grupo_derecha > = PP + Ciudadanos + Vox<br><br>
 * Y acabe imprimiendo el mensaje:<br>
 * “Los votos de la izquierda son < grupo_izquierda > que constituyen el < porcentaje > % del total y los
 * votos de la derecha son < grupo_derecha > que constituyen el < porcentaje > % del total”<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 21/03/2022
 */

public class ejer12 {

    public static void main(String[] args) {

        System.out.print("Votos PODEMOS: ");
        int vPodemos = 5;
        System.out.print("Votos PSOE: ");
        int vPsoe = 4;
        System.out.print("Votos PP: ");
        int vPP = 3;
        System.out.print("Votos CIUDADANOS: ");
        int vCiudadanos = 2;
        System.out.print("Votos VOX: ");
        int vVox = 1;

        int gIzquierda = vPodemos + vPsoe;
        int gDerecha = vPP + vCiudadanos + vVox;

        float pIzquierda = (100F * gIzquierda) / (gDerecha + gIzquierda);
        float pDerecha = (100F * gDerecha) / (gDerecha + gIzquierda);

        System.out.println("Los votos de la izquierda son " + gIzquierda + " que constituyen el " + pIzquierda + "% del total\n" +
                "y los votos de la derecha son " + gDerecha + " que constituyen el " + pDerecha + " % del total");
    }
}
