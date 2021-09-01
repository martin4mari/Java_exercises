/*
 19. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *
 */
package introjava;
import java.util.Scanner;
public class ej19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n, i, j;
        System.out.println("Ingrese el tamaño del cuadrado");
        n = leer.nextInt();

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0 || j == n-1 || i == 0 || i == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
