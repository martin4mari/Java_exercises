/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
package Ej2;

/**
 *
 * @author Maria
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lavadora lavadora = new Lavadora();     
        Televisor tv = new Televisor();
           
        
        lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println(lavadora.toString());
        System.out.println("El precio final de la lavadora es: $"+ lavadora.getPrecio());
        
        tv.crearTelevisor();
        tv.precioFinal();
        System.out.println(tv.toString());
        System.out.println("El precio final del televisor es: $" + tv.getPrecio());
    }
}
