/*
. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package introjava;

import java.util.Scanner;

public class ej16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i, num, suma;
        suma = 0;

        for (i = 0; i < 20; i++) {
            System.out.println("Ingresar un numero ");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
            } else if (num == 0) {
                System.out.println("Se capturo el numero 0");
                break;
            }
        }
        System.out.println("La suma de todos los numeros ingresados = " + suma);
    }
}
