/*
9. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java
 */
package introjava;

import java.util.Scanner;

public class EJ9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("Ingrese una frase ");
        boolean log = false;

        while (log==false) {
            frase = leer.next();
            if (frase.equals("eureka")) {           // la funcion devuelve un valor booleano (metodo)
                System.out.println("Correcto!");
                log = true;
            } else {
                System.out.println("Incorrecto");
            }
        }
    }
}