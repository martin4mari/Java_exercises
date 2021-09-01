package Ej5;

public class Cuenta {

    private int numCuenta;
    private int DNI;
    private double saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int DNI, double saldo, double interes) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Nro de cuenta: " + numCuenta + "  DNI: " + DNI + "  Saldo: $" + saldo;
    }
}