/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Ej4;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Rectangulo Rec = new Rectangulo();
        System.out.println("Ingresar el valor de base y altura del rectangulo");

        Rec.crearRectangulo(sc.nextInt(), sc.nextInt());
        
        int base = Rec.getBase();
        int altura = Rec.getAltura();
        
        System.out.println("Superficie= " + Rec.superficie(base, altura)+" cm2");
        System.out.println("Perimetro= " + Rec.perimetro(base, altura)+" cm");
        System.out.println("Representacion con asteriscos:");
        Rec.dibujar(base, altura);
    }

}