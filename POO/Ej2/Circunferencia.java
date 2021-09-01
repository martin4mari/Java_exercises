/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Ej2;
public class Circunferencia {
    private double radio;

    //constructor vacio
    public Circunferencia() {
    }
//constructor con radio de argumento

    public Circunferencia(double radio) {
        this.radio = radio;
    }
//metodos getters y setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //no enteiendo como usarlo
    public void crearCircunferencia(double radio) {
        this.radio = radio;
    }
// metodos para area y perimetro 
    public void area(double radio) {
        double a = Math.PI * Math.pow(radio, 2);
        System.out.println(a + " cm cuadrados");
    }

    public double perimetro(double radio) {
        double p = 2 * Math.PI * radio;
        return p;
    }
}