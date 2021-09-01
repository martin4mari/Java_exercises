/*
Considera que estás desarrollando una web para una empresa que fabrica motores 
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipo Motor y permitir que el usuario ingrese un valor entre 1 y 4. 
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una 
bomba de agua”. 
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una 
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una 
bomba de hormigón”. 
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una 
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No 
existe un valor válido para tipo de bomba”
 */
package introjava;

import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int motor;
        motor = leer.nextInt();

        if (motor == 1) {
            System.out.println("La bomba es de tipo bomba de agua ");
        } else if (motor == 2) {
            System.out.println("La bomba es de tipo gasolina ");
        } else if (motor == 3) {
            System.out.println("La bomba es de tipo hormigon ");
        } else if (motor == 4) {
            System.out.println("La bomba es de tipo pasta alimenticia ");
        } else {
            System.out.println("No existe un valor valido para tipo de bomba");
        }
    }
}