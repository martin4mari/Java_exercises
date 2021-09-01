package introjava;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String name;

        name = leer.next();
        System.out.println("Su nombre es : " + name);

    }

}
