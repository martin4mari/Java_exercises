package Nespresso;
import java.util.Scanner;
public class CafeteraService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Cafetera coffee = new Cafetera();

    public void llenarCafetera(Cafetera coffee) {
        coffee.setCantidadActual(coffee.getCapacidadMax());
        System.out.println("Llenando cafetera...");
        System.out.println("Cafetera llena : " + coffee.getCapacidadMax() + " ml");
    }

    public void servirTaza(Cafetera coffee) {
        System.out.println("Ingrese tamaño de la taza en ml ");
        int t = sc.nextInt();
        int c = coffee.getCantidadActual();
        System.out.println("Sirviendo café...");
        if (t <= c) {
            System.out.println("Se ha llenado la taza");
            coffee.setCantidadActual(c - t);
        } else {
            System.out.println("No se ha podido llenar la taza. Se sirvieron " + c + " ml");
            coffee.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera coffee) {
        System.out.println("La cafetera esta vacía");
        coffee.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera coffee) {
        System.out.println("Cantidad de café que desea agregar?");
        int add = sc.nextInt();
        int max = coffee.getCapacidadMax();
        if (add <= max) {
            System.out.println("Se han agregado los " + add + " ml de café");
            coffee.setCantidadActual(add);
        } else {
            System.out.println("Usted superó la capacidad de la cafetera, se agregaron " + max + " ml de café. ");
            coffee.setCantidadActual(max);
        }
    }
}