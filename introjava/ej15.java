/*
. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package introjava;

import java.util.Scanner;

public class ej15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double resp;
        char s;
        int menu;
        System.out.println(" Ingrese dos numeros enteros positivos");
        int num = leer.nextInt();
        int num2 = leer.nextInt();        
              
        do {
            System.out.println("Menu Calculadora: \n 1. Sumar  2. Restar  3. Multiplicar  4.Dividir  5.Salir");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    resp = num + num2;
                    System.out.println("Resultado : " + resp);
                    break;
                case 2:
                    resp = num - num2;
                    System.out.println("Resultado : " + resp);
                    break;

                case 3:
                    resp = num * num2;
                    System.out.println("Resultado : " + resp);
                    break;

                case 4:
                    resp = num / num2;
                    System.out.println("Resultado : " + resp);
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    s = leer.next().charAt(0);
                    if (s == 'S' || s == 's') {
                        break;
                    }
            }
        } while (num > 0);
    }
}
