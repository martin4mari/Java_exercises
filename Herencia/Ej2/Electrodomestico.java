/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
 */
package Ej2;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergy;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergy, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergy = consumoEnergy;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergy() {
        return consumoEnergy;
    }

    public void setConsumoEnergy(char consumoEnergy) {
        this.consumoEnergy = consumoEnergy;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        // convierto el char a string para poder aplicar uppercase y equals
        String aux = String.valueOf(letra).toUpperCase();
        if (aux.equals("A") || aux.equals("B") || aux.equals("C") || aux.equals("D") || aux.equals("E") || aux.equals("F")) {
            consumoEnergy = letra;
        } else {
            consumoEnergy = 'F';
        }
    }

    public void comprobarColor(String color) {
        String aux = color.toLowerCase();
        if (aux.equals("rojo") || aux.equals("blanco") || aux.equals("negro") || aux.equals("gris") || aux.equals("azul")) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Color (blanco, negro, rojo, azul o gris):");
        color = sc.next();
        comprobarColor(color);
        System.out.println("Consumo energetico(A-F)");
        comprobarConsumoEnergetico(sc.next().charAt(0));
        System.out.println("Peso en kg:");
        peso = sc.nextDouble();
    }

    public void precioFinal() {
        String aux= String.valueOf(consumoEnergy).toUpperCase();
        switch (aux) {
            case "A" :
                precio = 1000;
                break;
            case "B":
                precio = 800;
                break;
            case "C":
                precio = 600;
                break;
            case "D":
                precio = 500;
                break;
            case "E":
                precio = 300;
                break;
            case "F":
                precio = 100;
                break;
        }

        if (peso >= 1 && peso < 20) {
            precio += 100;
        } else if (peso < 50) {
            precio += 500;
        } else if (peso < 80) {
            precio += 800;
        } else {
            //mayores de 80 kg
            precio += 1000;
        }
        
    }
    @Override
    public String toString() {
        return "Electrodoméstico--  color: " + color + ", consumo energético: tipo " + consumoEnergy + ", peso: " + peso +" kg";
    }
}
