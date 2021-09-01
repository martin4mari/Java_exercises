/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada
 */
package Ej8;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Cadena S = new Cadena();
        CadenaService cs = new CadenaService();

        System.out.println("Ingrese una frase");

        S.setFrase(sc.next());
        S.setLongitud(S.getFrase().length());

        cs.mostrarVocales(S);
        cs.invertirFrase(S);
        cs.vecesRepetido(S);
        cs.compararLongitud(S);
        cs.unirFrase(S);
        cs.reemplazar(S);
        System.out.println(cs.contiene(S));
    }
}
