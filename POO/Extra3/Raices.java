package Extra3;

public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        double d = Math.pow(this.b, 2) - (4 * this.a * this.c);
        return d;
    }

    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double raiz = -this.b / (2 * this.a);
            System.out.println("Raiz = " + raiz);
        }
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            double r = (-this.b + Math.sqrt(getDiscriminante())) / (2 *this.a);
            double r2 = (-this.b - Math.sqrt(getDiscriminante())) / (2 * this.a);
            System.out.println("Raiz 1 = " + r);
            System.out.println("Raiz 2 = " + r2);
        }
    }
    
   public void calcular(){
        obtenerRaices();
        obtenerRaiz();
    }
}
