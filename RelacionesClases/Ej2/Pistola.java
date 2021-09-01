package Ej2;

public class Pistola {

    private double pocActual;
    private double pocAgua;

    public Pistola() {
    }

    public Pistola(Integer pocActual, Integer pocAgua) {
        this.pocActual = pocActual;
        this.pocAgua = pocAgua;
    }

    public double getPocActual() {
        return pocActual;
    }

    public void setPocActual(double pocActual) {
        this.pocActual = pocActual;
    }

    public double getPocAgua() {
        return pocAgua;
    }

    public void setPocAgua(double pocAgua) {
        this.pocAgua = pocAgua;
    }

    public void setPocActual(Integer pocActual) {
        this.pocActual = pocActual;
    }

    public void setPocAgua(Integer pocAgua) {
        this.pocAgua = pocAgua;
    }

    @Override
    public String toString() {
        return "Pistola{" + "pocActual=" + pocActual + ", pocAgua=" + pocAgua + '}';
    }

    public void llenarPistola() {
        pocActual =Math.round(Math.random()*10);
        pocAgua =Math.round(Math.random()*10);
    }

    public boolean mojar() {
        if (pocAgua == pocActual) {
            return true;
        }
        return false;
    }

    public void siguienteChorro() {
        pocActual =Math.round(Math.random()*10);
    }
}
