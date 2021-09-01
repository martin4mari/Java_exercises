/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. 
 */
package introjava;

import java.util.Scanner;

public class ej18 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String e;

        for (int i = 0; i < 1000; i++) {
            e = Integer.toString(i);
            e = e.replace("3", "E");
            System.out.println(e);
            
            /*       if (e.length() == 1) {
                System.out.println("0-0-" + e);
            } else if (e.length() == 2) {
                System.out.println("0-" + e);
            } else {
                System.out.println(e);
             */
        }
    }
}


