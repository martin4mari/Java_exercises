/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. 
El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. 
Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package Ej10;

import java.util.Arrays;

public class NewMain {

    public static void main(String[] args) {

        double arrayA[] = new double[50];
        double arrayB[] = new double[10];

        llenarA(arrayA);
        Arrays.sort(arrayA);
        arrayB = Arrays.copyOf(arrayA, 20);
        llenarB(arrayB);
        print(arrayB);
    }

    public static void llenarA(double arrayA[]) {
        System.out.println("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = Math.round(Math.random() * 100);
            System.out.print("[" + arrayA[i] + "]");
        }
                System.out.println("\n");
    }

    public static void llenarB(double arrayB[]) {
        for (int i = 9; i < arrayB.length; i++) {
            arrayB[i] = 0.5;
        }
    }

    public static void print(double arrayB[]) {
        System.out.println("Array B = ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print("["+arrayB[i]+"]");
        }
    }
}
