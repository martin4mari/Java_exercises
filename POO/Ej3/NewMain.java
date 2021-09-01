package Ej3;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Operacion O1 = new Operacion();
        
        System.out.println("Ingrese los numeros para operar");
        
        O1.crearOperacion(sc.nextInt(), sc.nextInt());
        
        int num1 = O1.getNum1();
        int num2 = O1.getNum2();
        
        O1.sumar(num1, num2);
        O1.restar(num1, num2);
        O1.multiplicar(num1, num2);
        O1.dividir(num1, num2);
    }
}