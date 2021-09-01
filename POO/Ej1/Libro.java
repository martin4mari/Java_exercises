package Ej1;
//cuando la clase tiene el modificador final no puede tener herencias? tampoco se puede instanciar un objeto de esa clase 

public class Libro {
// private final String ISBN = "The book thief";  
// si uso el final en el atributo no se puede cambiar, y se asigna si o si aca el valor que quedara fijo (constante ya que no se puede modificar)
// y si usamos static final creamos una cte de clase, un atributo común a todos los objetos de esa clase
// creo los atributos de mi clase :

    public String ISBN;
    public String title;
    public String author;
    public int pag;

//Constructor por default- vacio
    public Libro() {
    }

//Constructor con 4 arg
    public Libro(String ISBN, String title, String author, int pag) {
        //el this es necesario cuando los nombres son iguales . es a eleccion,lo podria hacer como el hola e igual funciona
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.pag = pag;
    }
    
//metodo para cargar libro
    public void cargarLibro(String ISBN, String title, String author, int pag) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.pag = pag;
    }

//metodo para mostrar libro    
    public void mostrarLibro(String ISBN, String title, String author, int pag) {
        System.out.println("ISBN : " + ISBN);
        System.out.println("Titulo : " + title);
        System.out.println("Autorx: " + author);
        System.out.println("Nro de paginas :" + pag);
    }
}

/*@Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", cola=" + cola + ", edad=" + edad + ", raza=" + raza + ", energia=" + energia + '}';
    }*/
/*llenarLibro es un metodo como constructor pero no lo es. lo que pide el problema no es lo ideal*/