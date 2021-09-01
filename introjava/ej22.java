/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente
 */
package introjava;

import java.util.Scanner;

public class ej22 {

    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector;
        vector = new int[101];
        // en este punto el vector ya se declaro, se guardo en memoria y se inicializo con el default = 0

        // se puede hacer como lo anterior o declara e inicializar con valores predeterminados/asignando conjunto de ctes 
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}}; //primera fila , segunda fila (con sus tres columnas cada una )

        for (int i = 100; i > 0; i--) {
            vector[i] = i;
            System.out.println(i);
        }
    }
}
