package Ej1;

import java.util.Scanner;

public class RelacionesClases {

    public static void main(String[] args) {
        Persona p = new Persona();
        Persona p2 = new Persona();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Perro m = new Perro("Sanguchito", "fox terrier", 2, "mediano");
        Perro m2 = new Perro("Pepa", "mestiza", 1, "pequeño");
        
        p.crearPersona();
        p.setPerro(m);
        p2.crearPersona();
        p2.setPerro(m2);
        
        p.mostrarPersona();
        p2.mostrarPersona();
    }
}
