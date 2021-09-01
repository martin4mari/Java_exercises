/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Ejemplo Date como atributo: DateAtributo
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior
 */
package Ej12;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fechaNac;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona() {
        System.out.println("Ingrese el nombre");
        setNombre(sc.next());
        System.out.println("Ingrese fecha de nacimiento. Año, mes y dia");
        Date fecha = new Date(sc.nextInt() - 1900, sc.nextInt(), sc.nextInt());
        setFechaNac(fecha);
    }

    public int calcEdad() {
        Date actual = new Date();
        int edad = actual.getYear() - fechaNac.getYear();
        return edad;
    }

    public boolean menorQue(int edad) {
        return calcEdad() < edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Edad: " + calcEdad());
        System.out.println("Fecha de nacimiento : " + this.fechaNac);
    }
}
