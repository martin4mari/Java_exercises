/*
8. Crear un programa que dado un numero determine si es par o impar.
 */
package introjava;

import java.util.Scanner;

public class EJ8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        int num, modulo;
        num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es par ");

        } else {
            System.out.println("El numero es impar");

        }
    }
}
