package Ej5.serviceCuenta;

import Ej5.Cuenta;
import java.util.Scanner;

public class CuentaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta c = new Cuenta();

        System.out.println("Ingrese numero de cuenta bancaria");
        c.setNumCuenta(sc.nextInt());
        System.out.println("Ingrese su DNI");
        c.setDNI(sc.nextInt());
        System.out.println("Ingrese saldo en pesos");
        c.setSaldo(sc.nextDouble());
        return c;
    }

    public double ingresar(Cuenta c1) {
        // como accedo al saldo que ingreso el usuario (???
        System.out.println("Monto que ingresa en $:");
        double i = sc.nextDouble() + c1.getSaldo();
        c1.setSaldo(i);
        return c1.getSaldo();
    }

    public double retirar(Cuenta c1) {
        System.out.println("Monto que desea retirar en $:");
        double r = sc.nextDouble();
        if (r >= c1.getSaldo()) {
            c1.setSaldo(0);
            return 0;
        } else {
            c1.setSaldo(c1.getSaldo() - r);
            return c1.getSaldo();
        }
    }

    public void extraccionRapida(Cuenta c1) {
        System.out.println("Monto que desea retirar en $ (hasta %20) :");
        double ext = sc.nextDouble();
        double per = c1.getSaldo() * 0.2;
        if (ext <= per) {
            c1.setSaldo(c1.getSaldo() - ext);
        } else {
            System.out.println("Error. Debe extraer un máximo del %20");
        }
    }
 public void  consultarSaldo(Cuenta c1) {
     System.out.println("Su saldo actual total : $" + c1.getSaldo());
 }
}