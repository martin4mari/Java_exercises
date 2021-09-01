/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Ejemplo vector como atributo: VectorAtributo
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
25
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package Extra6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ahorcado {

    private char[] palabra;
    private int letrasEncontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int jugadasMax) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego() {
        System.out.println("¡Bienvenidx a Ahorcado!");
        //String p = JOptionPane.showInputDialog("Ingrese la palabra");
        System.out.println("Ingrese la palabra");
        String p =sc.next();
        for (int i = 0; i < p.length(); i++) {
            this.palabra = new char[p.length()];
            this.palabra[i]= p.charAt(i);
            System.out.print(this.palabra[i]);
        }
        System.out.println("Ingrese el numero maximo de jugadas");
jugadasMax = sc.nextInt();
       // this.jugadasMax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad maxima de jugadas"));
        this.letrasEncontradas = 0;
    }

//    public void longitud() {
//        int l = palabra.length;
//        System.out.println("Su palabra tiene " + l + " letras");
//        for (int i = 0; i < palabra.length; i++) {
//            System.out.print("_ ");
//        }
//    }

//    public void buscarLetra() {
//        System.out.println("Ingrese una letra");
//        String letra = sc.next();
//        System.out.println(letra);
//        int vector []= {2,3,6,7};
//        int c = 0;
//        for (int i = 0; i < palabra.length; i++) {
//            System.out.println("{"+vector[i]);
//            System.out.println(palabra[i]);
//            if (letra.equals(palabra[i])) {
//                System.out.println("La letra se ha encontrado");
//                System.out.println(letra);
//                // this.letrasEncontradas++;
//            } else {
//                System.out.print("_ ");
//                c++;
//            }
//        }
//        
//        if (c == palabra.length) {
//            this.jugadasMax = this.jugadasMax - 1;
//            System.out.println("La letra no ha sido encontrada. Usted tiene " + this.jugadasMax + " intentos");
//        }
//    }
    
    
    public void buscarLetra(){
        for (int i = 0; i < palabra.length; i++) {
            System.out.println("{"+this.palabra[i]);
        }
    }
    
}
