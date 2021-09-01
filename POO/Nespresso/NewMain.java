package Nespresso;
public class NewMain {

    public static void main(String[] args) {
        CafeteraService c = new CafeteraService();
        Cafetera coffee = new Cafetera();
        
        c.llenarCafetera(coffee);
        c.servirTaza(coffee);
        c.vaciarCafetera(coffee);
        c.agregarCafe(coffee);
    }

}