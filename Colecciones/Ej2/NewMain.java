/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.
 */
package Ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        System.out.println("\nIngrese el nombre a eliminar:");
        String eliminar = sc.next();
        
        boolean valor = false;
        Iterator<String> it = raza.iterator();
        
        while (it.hasNext()) {
            String auxi = it.next();
            if (auxi.equals(eliminar)) {
                it.remove();
                valor = true;
            }
        }
        
        if (valor) {
            Collections.sort(raza);
            System.out.println(raza.toString());
        } else {
            System.out.println("\nNo se encontro el nombre de la raza de perro");
            Collections.sort(raza);
            System.out.println(raza.toString());
        }
    }

}
