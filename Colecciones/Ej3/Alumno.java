/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main. 
 */
package Ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
     private Scanner sc;
    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
        this.notas = new ArrayList();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public Alumno Crear() {
        ArrayList<Integer>notas=new ArrayList();
        System.out.print("ingrese nombre:");
        nombre = sc.next();
        for (int i = 0; i < 3; i++) {
            System.out.print("ingrese nota " + (i + 1) + ":");
            notas.add(sc.nextInt());
        }
        return new Alumno(nombre, notas);
    }
    
    public double notaFinal(String name){
        double prom=(notas.get(0)+notas.get(1)+notas.get(2));
        return prom/3;
    }
    @Override
    public String toString() {
        return "Alumnx: " + nombre + ", notas=" + notas ;
    }
}

