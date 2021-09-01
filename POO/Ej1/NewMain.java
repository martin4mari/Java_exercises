/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package Ej1;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in).useDelimiter("\n");
        Libro L1 = new Libro();
        System.out.println("Ingrese los datos del libro");
        L1.cargarLibro(sc.next(), sc.next(), sc.next(), sc.nextInt());
        L1.mostrarLibro(L1.ISBN, L1.title, L1.author, L1.pag);
    }
}