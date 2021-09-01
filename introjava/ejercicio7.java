/*
7. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla
 */
package introjava;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros");
        int num, num2;
        num = leer.nextInt();
        num2 = leer.nextInt();

        if (num > num2) {
            System.out.println(num + " es el mayor");
        } else if (num < num2) {
            System.out.println(num2 + "es el mayor");
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
