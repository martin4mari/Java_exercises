package Ej2;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Circunferencia C1 = new Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferenica");
        C1.setRadio(sc.nextDouble());
        
        System.out.println("El area de la circunferencia : ");
        C1.area(C1.getRadio());
      
        System.out.println("El perimetro : "+ C1.perimetro(C1.getRadio()) +" cm" ); 
    }
}