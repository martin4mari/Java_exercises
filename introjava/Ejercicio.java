package introjava;

import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Ejercicio {

    public static void main(String[] args) {

        int num, num2;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros ");
        num = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("El resultado de la suma de enteros es : " + (num + num2));

    }

}
