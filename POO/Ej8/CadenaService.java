/*• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y  contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
package Ej8;

import java.util.Scanner;

public class CadenaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena c) {
        int cont = 0;
        for (int i = 0; i < c.getFrase().length(); i++) {
            char ch = c.getFrase().charAt(i);
            if ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " vocales en la frase");
    }

    public void invertirFrase(Cadena c) {
        String invertida = "";
        for (int i = c.getFrase().length() - 1; i >= 0; i--) {
            invertida += c.getFrase().charAt(i);
        }
        System.out.println("Frase invertida: " + invertida);
    }

    public void vecesRepetido(Cadena c) {
        int cont = 0;
        System.out.println("Ingresar un caracter");
        char cha = sc.next().charAt(0);
        for (int i = 0; i < c.getFrase().length(); i++) {
            char letra = c.getFrase().charAt(i);
            if (letra == cha) {
                cont++;
            }
        }
        System.out.println("El caracter " + cha + " se repite " + cont + " veces");
    }

    public void compararLongitud(Cadena c) {
        System.out.println("Ingrese nueva frase o palabra(lenght)");
        String n = sc.next();
        int lar = n.length();
        int i = c.getLongitud().compareTo(lar);
        switch (i) {
            case 0:
                System.out.println("Las frases tienen la misma longitud: " + n.length() + " caracteres ");
                break;
            case -1:
                System.out.println("La frase ingresada tiene mas caracteres");
                break;
            case 1:
                System.out.println("La frase ingresada posee menos caracteres");
                break;
        }
    }
    public void unirFrase(Cadena c) {
        System.out.println("Ingrese frase para unir");
        String u = sc.next();
        System.out.println(c.getFrase().concat(u));
    }

    public void reemplazar(Cadena c) {
        System.out.println("Ingrese una letra para reemplazar");
        String letra = sc.next();
        String r = c.getFrase().replace("a", letra);
        System.out.println(r);
    }

    public boolean contiene(Cadena c) {
        System.out.println("Ingrese un caracter para buscar");
        String l = sc.next();
        int comp = c.getFrase().indexOf(l);
        return comp != -1;
    }
}
