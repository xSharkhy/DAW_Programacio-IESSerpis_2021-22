package evaluacio1.UD02.UD02_02;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 1</h4
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 *
 * Escribe un programa de Java que escriba el siguiente texto y utilice valores de variables cada vez que el
 * texto es de color rojo. De esta forma, se podrá utilizar de plantilla para cualquier año:<br><br>
 *
 * “Buenas noches. En estos días tan especiales a finales del año 'año' en los que siempre nos deben unir
 * los mejores sentimientos os deseo, junto a la Reina y nuestras hijas, una Feliz Navidad y que en el
 * próximo año 'año + 1' podáis ver cumplidos vuestros anhelos y aspiraciones”.<br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 14/03/2022
 */

public class ejer01 {
    public static void main(String[] args) {
        int year = 2021;
        System.out.println("Buenas noches. En estos días tan especiales a finales del año " + year + " en los que siempre nos deben unir\n" +
                "los mejores sentimientos os deseo, junto a la Reina y nuestras hijas, una Feliz Navidad y que en el \n" +
                "próximo año " + (year + 1) + " podáis ver cumplidos vuestros anhelos y aspiraciones");
    }
}
