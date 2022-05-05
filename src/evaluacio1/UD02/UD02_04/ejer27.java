package evaluacio1.UD02.UD02_04;

public class ejer27 {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x + "\t(PRINT X)\tEl programa imprime el valor de la variable \"x\" ( 10 ).");
        x++;
        System.out.println(x + "\t(PRINT X)\tEl programa tras sumar 1, imprime el valor de la variable \"x\" ( 11 ).");
        System.out.println(++x + "\t(PRINT ++X)\tEl programa suma 1 Y LUEGO imprime el valor de la variable \"x\" ( 12 ).");
        System.out.println(x++ + "\t(PRINT X++)\tEl programa imprime el valor de la variable Y LUEGO suma 1 \"x\" ( 13 ).");    //printa valor de X y luego suma 1 (12 + 1)
        System.out.println(x + "\t(PRINT X)\tEl programa imprime el valor de la variable \"x\" ( 13 ).");      //printa valor de X (X = 13)
        System.out.println(x++ + "\t(PRINT X++)\tEl programa imprime el valor de la variable Y LUEGO suma 1 \"x\" ( 14 )");    //printa valor de X y luego suma 1 (13 + 1)
        System.out.println(++x + "\t(PRINT ++X)\tEl programa suma 1 Y LUEGO imprime el valor de la variable \"x\" ( 15 ).");    //suma y printa nuevo valor de X (X = 14 + 1)
    }
}
