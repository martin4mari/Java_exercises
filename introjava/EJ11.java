/*
11. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java
 */
package introjava;

import java.util.Scanner;

public class EJ11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una palabra o frase ");
        String f, let;
        f = leer.next();
        let = f.substring(0, 1);

        if ("A".equals(let)) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto");
        }
    }
}


