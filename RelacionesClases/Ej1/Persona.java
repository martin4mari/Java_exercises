/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Ej1;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    private Perro perro;
    private Scanner sc;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long dni) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, String apellido, int edad, long dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Persona crearPersona() {
                Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Nombre y apellido:");
        nombre = sc.next();
        apellido = sc.next();
        System.out.println("Edad:");
        edad = sc.nextInt();
        System.out.println("DNI:");
        dni = sc.nextLong();
        return new Persona(nombre, apellido, edad, dni);
    }

    public void mostrarPersona() {
        System.out.println("Nombre : " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Adopto a : " + perro);
    }

}
