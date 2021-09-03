/*
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio
 */
package Ej2;

import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Lavadora extends Electrodomestico{
    
    protected int carga;

    public Lavadora() {
    }   

    public Lavadora(int carga, double precio, String color, char consumoEnergy, double peso) {
        super(precio, color, consumoEnergy, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

   public void crearLavadora(){
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
       super.crearElectrodomestico();
       System.out.println("Carga en kg:");
       carga=sc.nextInt();
   }

    @Override
   public void precioFinal(){
       super.precioFinal();
       if (carga > 30){
           precio+=500;
       }
   }

    @Override
    public String toString() {
        super.toString();
        return "Lavadora--  carga:" + carga + "kg";
    }
   
}
