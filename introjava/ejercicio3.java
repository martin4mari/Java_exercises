package introjava;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase, mayus, minus;
        
        System.out.println("Ingrese una frase ");
        frase = leer.next();
        
        mayus= frase.toUpperCase();
        System.out.println(" La frase en mayuscula : " + mayus);
     
        minus = mayus.toLowerCase();
        System.out.println("La frase en minuscula :  " + minus ); 
        
    }
    
}
