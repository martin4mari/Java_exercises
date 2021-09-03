/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
 */
package Ej2;

import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergy, double peso) {
        super(precio, color, consumoEnergy, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintetizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Resolucion en pulgadas:");
        resolucion = sc.nextInt();
        System.out.println("Sintonizador TDT: (S/N)");
        String aux = sc.next().toUpperCase();
        sintonizadorTDT = aux.equals("S");
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            double aux = precio * 0.3 + precio;
            this.precio = aux;
        }
        if (sintonizadorTDT) {
            precio += 500;
        }
    }
    
    @Override
    public String toString() {
        super.toString();
        return "Televisor--" + "resolución: " + resolucion + " pulgadas, sintonizadorTDT: " + sintonizadorTDT ;
    }

}
