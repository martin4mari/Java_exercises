
/*5. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package introjava;

import java.util.Scanner;

public class ejercicio5 {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese T en C° ");
        
        int celsius, fahr; 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        celsius = leer.nextInt();
        fahr= 32 + ( 9 * celsius/ 5);
        
        System.out.println("T en fahrenheit : " + fahr );
               
        
    }
    
}
