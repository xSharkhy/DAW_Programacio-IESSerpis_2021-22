package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 18</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 * Dado un valor en Mb introducido por teclado, mostrar su equivalencia en bytes, KB, GB y TB.<br>
 * Mostrar la información en 5 columnas.<br>
 * Tener en cuenta la tabla de equivalencias siguiente:<br><br></p>
 * <b>Tabla de equivalencias en la Informática</b><br><br>
 * <table border="1" style="width:100%;padding:10px;">
 *     <tr>
 *         <th>Medida</th>
 *         <th>Simbologia</th>
 *         <th>Equivalencia</th>
 *         <th>Equivalencia en bytes</th>
 *     </tr>
 *     <tr>
 *         <td>byte</td>
 *         <td>B</td>
 *         <td>8 bits</td>
 *         <td>1 byte</td>
 *     </tr>
 *     <tr>
 *         <td>kilobyte</td>
 *         <td>KB</td>
 *         <td>1024 bytes</td>
 *         <td>1024 bytes</td>
 *     </tr>
 *     <tr>
 *         <td>megabyte</td>
 *         <td>MB</td>
 *         <td>1024 KB</td>
 *         <td>1 048 576 bytes</td>
 *     </tr>
 *     <tr>
 *         <td>gigabyte</td>
 *         <td>GB</td>
 *         <td>1024 MB</td>
 *         <td>1 073 741 824 bytes</td>
 *     </tr>
 *     <tr>
 *         <td>terabyte</td>
 *         <td>TB</td>
 *         <td>1024 GB</td>
 *         <td>1 099 511 627 778 bytes</td>
 *     </tr>
 *     <tr>
 *         <td>petabyte</td>
 *         <td>PB</td>
 *         <td>1024 TB</td>
 *         <td>1 125 899 906 842 624 bytes</td>
 *     </tr>
 *     <tr>
 *         <td>exabyte</td>
 *         <td>EB</td>
 *         <td>1024 PB</td>
 *         <td>1 152 921 504 606 846 976 bytes</td>
 *     </tr>
 *     <tr>
 *         <td>zetabyte</td>
 *         <td>ZB</td>
 *         <td>1024 EB</td>
 *         <td>1 180 591 620 717 411 303 424 bytes</td>
 *     </tr>
 *     <tr>
 *         <td>yottabyte</td>
 *         <td>YB</td>
 *         <td>1024 ZB</td>
 *         <td>1 280 925 819 614 629 174 706 176 bytes</td>
 *     </tr>
 *     <tr>
 *         <td>brontobyte</td>
 *         <td>BB</td>
 *         <td>1024 YB</td>
 *         <td>1 237 940 039 285 380 274 899 124 224 bytes</td>
 *     </tr>
 *     <tr>
 *         <td>geopbyte</td>
 *         <td>GpB</td>
 *         <td>1024 BB</td>
 *         <td>1 267 650 600 228 229 401 496 703 205 376 bytes</td>
 *     </tr>
 * </table>
 * <br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 22/03/2022
 */

public class ejer18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de MegaBytes a transformar:");
        double mb = sc.nextDouble();
        double kb = mb * 1024;
        double gb = mb / 1024;
        double tb = mb / 1048576;
        String separadorAbsurdo = "#######################################################################################################";
        System.out.println("El valor introducido es " + mb);
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-12s# %-20s# %-20s# %-20s# %-20s#\n", "Unidad", "kB", "MB", "GB", "TB");
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-12s# %-20.3f# %-20.3f# %-20.3f# %-20.3f#\n", "Valor", kb, mb, gb, tb);
        System.out.println(separadorAbsurdo);
    }
}
