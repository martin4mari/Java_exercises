package Ej4;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public void crearRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int superficie(int base, int altura) {
        int s = base * altura;
        return s;
    }

    public int perimetro(int base, int altura) {
        int p = (base + altura) * 2;
        return p;
    }

    public void dibujar(int base, int altura) {
        for (int i = 0; i <altura; i++) {
            for (int j = 0; j < base; j++) {
                
                if (i == 0 || i == (altura - 1) || j == 0 || j == (base - 1)) {
                    System.out.print("*");
                } else {
                   System.out.print(" ");
                }
            }
                   System.out.println(" ");
        }
    }
    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
}