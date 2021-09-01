package Ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Pelicula peli = new Pelicula();
        ArrayList<Pelicula> repertorio = new ArrayList();

        String verif;
        do {
            Pelicula datos = peli.Crear();
            repertorio.add(datos);
            System.out.println("¿Desea guardar otra pelicula? (y/n)");
            verif = sc.next().toUpperCase();
        } while (verif.equals("Y"));

        System.out.println("Peliculas de mayor de 1 hora de duración : ");
        for (Pelicula pelicula : repertorio) {
            Integer aux = pelicula.getDuracion();
            if (aux > 1) {
                System.out.println(pelicula);
            }
        }

        System.out.println("\nRepertorio por duracion descendente (de mayor a menor)");
        Collections.sort(repertorio, Comparadores.ordenDsc);
        repertorio.forEach((a) -> System.out.println(a));

        System.out.println("\nRepertorio por duracion ascendente (de menor a mayor)");
        Collections.sort(repertorio, Comparadores.ordenAsc);
        repertorio.forEach((a) -> System.out.println(a));

        System.out.println("\nRepertorio por titulos en orden alfabetico: ");
        Collections.sort(repertorio, Comparadores.ordenAlfa);
        repertorio.forEach((a) -> System.out.println(a));

        System.out.println("\nRepertorio por directorxs en orden alfabetico");
        Collections.sort(repertorio, Comparadores.ordenAlfaDir);
        repertorio.forEach((a) -> System.out.println(a));
    }

}
