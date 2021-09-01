/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
//uso el main lo menos posible, para logica y pedir datos "lo sucio" se usa en el service
package Ej5;

import Ej5.serviceCuenta.CuentaService;

public class NewMain {

    public static void main(String[] args) {

        CuentaService cs = new CuentaService();
        //creo un objeto usando el molde Cuenta pero invoco el metodo usando el objeto de cuenta service
        Cuenta c1 = cs.crearCuenta();
        System.out.println("Saldo total : $" + cs.ingresar(c1));
        System.out.println("Saldo total :$ " + cs.retirar(c1));
        cs.extraccionRapida(c1);
        cs.consultarSaldo(c1);
        System.out.println(c1.toString());
    }
}