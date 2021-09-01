/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
 */
package Ej6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NewMain {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, String> Productos = new HashMap();
        String Prod = "", Prec = "", dato = "S";

        do {
            System.out.println("-Menú-");
            System.out.println("1-Agregar producto");
            System.out.println("2-Modificar precio producto");
            System.out.println("3-Borrar producto");
            System.out.println("4-Mostrar todos los productos");
            System.out.println("5-Salir");
            switch (leer.nextInt()) {
                case 1:
                    System.out.print("Nombre producto:");
                    Prod = leer.next();
                    System.out.print("Precio producto");
                    Prec = leer.next();
                    Productos.put(Prod, Prec);
                    break;
                case 2:
                    System.out.print("Nombre producto:");
                    Prod = leer.next();
                    if (Productos.containsKey(Prod)) {
                        System.out.print("Precio producto:");
                        Prec = leer.next();
                        Productos.put(Prod, Prec);
                    } else {
                        System.out.println("El producto no se encuentra cargado");
                    }
                    break;
                case 3:
                    System.out.print("Nombre producto:");
                    Prod = leer.next();
                    if (Productos.containsKey(Prod)) {
                        Productos.remove(Prod);
                    } else {
                        System.out.println("El producto no se encuentra cargado:");
                    }
                    break;
                case 4:
                    for (Map.Entry<String, String> aux : Productos.entrySet()) {
                        String Producto = aux.getKey();
                        String Precio = aux.getValue();
                        System.out.println("Producto: " + Producto + " Precio: " + Precio);
                    }
                    break;
                case 5:
                    System.out.println("¿Desea realizar otro operacion? (y/n)");
                    dato = leer.next().toUpperCase();
                    break;
                default:
                    System.out.println("Opcion erronea");
            }
        } while (dato.equals("Y"));
    }
}