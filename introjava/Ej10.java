/*
10. Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package introjava;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        int largo;
        System.out.println("Ingrese una frase o palabra de 8 caracteres  ");
        frase = leer.next();
        largo = frase.length();
        if (largo == 1) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
   
    

