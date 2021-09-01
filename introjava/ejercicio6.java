/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt(
 */
package introjava;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Ingresar un n entero");
        int num;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        num = leer.nextInt();

        System.out.println("El doble de " + num + "  : " + (num * 2));
        System.out.println("El triple de " + num + " : " + (num * 3));
        System.out.println("La raiz cuadrada de " + num + "  : " + Math.sqrt(num));

    }
}
