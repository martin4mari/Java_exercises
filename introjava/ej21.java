/*
21. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package introjava;

import java.util.Scanner;

public class ej21 {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa la cantidad de euros (€) a cambiar ");
        double euros = leer.nextDouble();
        System.out.println("Ingrese la moneda a convertir: \n 1. Dolares   2. Yenes   3. Libras");
        int moneda = leer.nextInt();
        Conversor(moneda, euros);
    }

    public static void Conversor (int m, double euros) {
        switch (m) {
            case 1:
                double dol = (euros * 1.28611);
                System.out.println("Conversion en dolares : $$ " + dol);
                break;
            case 2:
                double yen = (euros * 129.852);
                System.out.println("Conversion en yenes : " + yen);
                break;
            case 3:
                double lib = (euros * 0.86);
                System.out.println("Conversion en dolares : " + lib);
                break;
            default:
                System.out.println("Moneda incorrecta");
        }
    }
}
