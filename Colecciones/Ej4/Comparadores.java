package Ej4;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> ordenDsc= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    // lambda expression
    public static Comparator<Pelicula> ordenAsc = (Pelicula t, Pelicula t1) -> t.getDuracion().compareTo(t1.getDuracion());

    public static Comparator<Pelicula> ordenAlfa = (Pelicula t, Pelicula t1) -> t.getTitulo().compareTo(t1.getTitulo());

    public static Comparator<Pelicula> ordenAlfaDir = (Pelicula t, Pelicula t1) -> t.getDirector().compareTo(t1.getDirector());
}
