/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package Ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        HashSet<String> pais = new HashSet();
        
        String verif;
        do {
            System.out.print("Pais:");
            pais.add(sc.next());
            System.out.println("¿Desea guardar otro pais? (y/n)");
            verif = sc.next().toUpperCase();
        } while (verif.equals("Y"));

        System.out.println("\nLista de paises: ");
        System.out.println(pais);
       
        System.out.println("\nPaises en orden alfabetico: ");
        ArrayList<String>ordenar = new ArrayList(pais);
        Collections.sort(ordenar);
        System.out.println(ordenar);

        System.out.println("\nIngrese el pais a remover: ");
        String del = sc.next();

        Iterator<String> it = pais.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(del)) {
                it.remove();
            }
        }
        
        if (pais.contains(del)) {
            System.out.println("El pais ingresado no se encuentra");
        } else {
            System.out.println(del + " se ha eliminado correctamente");
        }
        System.out.println("Lista actualizada: "+ pais);
    }
}
