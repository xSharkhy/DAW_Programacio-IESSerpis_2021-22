package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

/**
 * <h1>UD2: Introducción a Java</h1>
 * <h2>Problemas Básicos de Programación</h2>
 * <h4>EJERCICIO 21</h4>
 * <a href="https://github.com/xSharkhy">Link a mi GitHub</a><br><br>
 * <p>
 *     Escribe un programa que calcule el total de una factura que tendrá siempre 5 conceptos distintos y que
 * tendrá un descuento.<br><br>
 * Para ello, el programa pedirá por teclado:<br>
 * <pre>
 * - El nombre del cliente
 * - El NIF.
 * - El domicilio.
 * - 5 líneas con los datos:
 *      - Cantidad
 *      - Concepto
 *      - Precio
 *      - Importe
 * - Porcentaje del descuento</pre><br>
 * Y mostrará la información de forma parecida a la siguiente imagen:<br><br>
 * <img src="../../../sources/Image_1.png" alt="Factura.png"/>
 * </p>
 * <br><br>
 *
 * @author Ismael Morejón Blasco, Licencia Libre *
 * @version v1.0a
 * @since 22/03/2022
 */

public class ejer21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEjercicio 21:\n");
        System.out.println("Introduzca el nombre completo del cliente:");
        String cliente = sc.nextLine();
        System.out.println("Introduzca el NIF del clietnte:");
        String nif = sc.nextLine();
        System.out.println("Introduzca el domicilio del cliente:");
        String domicilio = sc.nextLine();
        System.out.println("Introduzca el nombre del producto 1:");
        String prod1 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 1:");
        byte ctd1 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre1 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduzca el nombre del producto 2:");
        String prod2 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 2:");
        byte ctd2 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre2 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduzca el nombre del producto 3:");
        String prod3 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 3:");
        byte ctd3 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre3 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduzca el nombre del producto 4:");
        String prod4 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 4:");
        byte ctd4 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre4 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduzca el nombre del producto 5:");
        String prod5 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 5:");
        byte ctd5 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre5 = Double.parseDouble(sc.nextLine());
        double imp1 = ctd1 * pre1;
        double imp2 = ctd2 * pre2;
        double imp3 = ctd3 * pre3;
        double imp4 = ctd4 * pre4;
        double imp5 = ctd5 * pre5;
        double totalBruto = imp1 + imp2 + imp3 + imp4 + imp5;
        System.out.println("Introduzca el descuento a aplicar:");
        double descuento = Double.parseDouble(sc.nextLine());
        double total = totalBruto * ((100 - descuento) / 100);
        String separadorAbsurdo = "#######################################################################################";
        System.out.println(separadorAbsurdo);
        System.out.printf("# CLIENTE: %-57s N.I.F. %-9s #\n", cliente, nif);
        System.out.printf("# DOMICILIO: %-72s #\n", domicilio);
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-8s # %-50s # %-8s # %-8s #\n", "CANTIDAD", "CONCEPTO - REFERENCIA", "PRECIO", "IMPORTE");
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd1, prod1, pre1, imp1);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd2, prod2, pre2, imp2);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd3, prod3, pre3, imp3);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd4, prod4, pre4, imp4);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd5, prod5, pre5, imp5);
        System.out.println(separadorAbsurdo);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t# %-11s # %-14s # %-8s #\n", "TOTAL BRUTO", "DESCUENTO", "TOTAL");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t###########################################");
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t# %-11.2f # %% %-12.2f # %-8.2f #\n", totalBruto, descuento, total);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t###########################################");
    }
}
