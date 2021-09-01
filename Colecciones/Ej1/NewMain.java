/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
 */
package Ej1;
import java.util.ArrayList;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> raza = new ArrayList();

        String aux;
        do {
            System.out.print("Ingrese la raza del perro:");
            raza.add(sc.next());
            System.out.print("¿Desea guardar otro perro?(y/n)");
            aux = sc.next().toUpperCase();
        } while (aux.equals("Y"));

        System.out.println("Cantidad: " + raza.size());
        System.out.print("Lista de razas: ");
        System.out.println(raza.toString());
    }
}
