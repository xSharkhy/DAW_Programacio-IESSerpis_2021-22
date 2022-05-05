package evaluacio1.UD02.UD02_04;

import java.util.Scanner;

public class ejer28 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al programa donde todo sale redondo!");
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca el valor del radio:");
        double radius = sc.nextDouble();
        System.out.println("La longitud de la circunferencia es: " + (Math.PI * 2 * radius));
        System.out.println("El area de la circunferencia es: " + (Math.PI * Math.pow(radius, 2)));
        System.out.println("Si fuera una esfera, su volumen sería: " + ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)));
    }
}
