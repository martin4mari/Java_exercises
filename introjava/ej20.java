/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package introjava;

import java.util.Scanner;

public class ej20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, c;
        c = 0;

        do {
            System.out.println("Ingrese un numero del 1 al 20 ");
            num = leer.nextInt();
            if (num > 0 && num <= 21) {
                System.out.print(num);

                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
                c = c + 1;
                System.out.println("");
            }
        } while (c < 4);

    }
}

