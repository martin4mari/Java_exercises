/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package introjava;

import java.util.Scanner;

public class ej23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] vector = new int[10];
        System.out.println("Ingrese un numero a buscar en el vector");
        int n = leer.nextInt();
        int c= 0;

        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10) +1; // le sume uno para q me tome del 1 al 10 y no desde el 0 al 9. el random no incluye 1.0
            System.out.print("[" + vector[i] + "]");

            if (vector[i] == n) {
                System.out.println("\nEl numero se encontro en la posicion " + i);
                c=c+1;
            }
        }
        if (c==0) {
            System.out.println("\nNo se encontro ese valor");
        }
    }
}
