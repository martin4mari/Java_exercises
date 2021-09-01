/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date()
 */
package Ej11;

import java.util.Date;
import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
        Date fechaActual = new Date();

        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año")) - 1900;
        //cuenta del -1900. el 1900 seria el 0 
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
        //cuenta del 0 al 11
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia"));
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hora"));
        int min = Integer.parseInt(JOptionPane.showInputDialog("Ingrese minutos"));

        Date fecha = new Date(anio, mes, dia, hora, min);
        System.out.println(fecha + " es mi fecha de nacimiento");
        System.out.println(fechaActual + " es la fecha actual");
        
        int diferencia =fechaActual.getYear() - fecha.getYear();
        System.out.println(diferencia+" años pasaron desde mi nacimiento");
    }
}
