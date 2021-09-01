/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package introjava;

import java.util.Scanner;

public class ej17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String str;
        int c = 0;
        int lar;
        String fde = "&&&&&";
        String char1, char2; 

        do {
            System.out.println("Ingresar una frase de 5 caracteres max");
            str = leer.next();
            lar = str.length();

            if (lar <= 5) {
                char1 = str.substring(0, 1);
                char2 = str.substring(lar - 1, lar);
                if (char1.equals("x") && char2.equals("o")) {
                    c = c + 1;
                }
            }
            if (str.equals(fde)) {
                break;
            }
        } while (!(str.equals(fde)));
        System.out.println(c + " frases correctas");
    }
}

