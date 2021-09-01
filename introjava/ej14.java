/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 
 */
package introjava;

import java.util.Scanner;

public class ej14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero limite ");
        int suma = 0;
        int num = leer.nextInt();
        int n;

        do {
            System.out.println("Ingrese numeros para sumar");
            n = leer.nextInt();
            suma = suma + n;
            if (suma > num) {
                break;
            }
        } while (suma != num);  // puse esta condicion para comprobar que el break funciona
    }
}
