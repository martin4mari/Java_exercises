/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Ej9;

public class Matematica {

    private double num1, num2;

    public Matematica() {
    }
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double devolverMayor() {
        double mayor = Math.max(num1, num2);
        return mayor;
    }
    public double devolverMenor() {
        double menor = Math.min(num1, num2);
        return menor;
    }
    public void calcPotencia() {
        double mayor = Math.round(devolverMayor());
        double menor = Math.round(devolverMenor());
        double pot = Math.pow(mayor, menor);
        System.out.println("Resultado de potencia : " + pot);
    }
    public void calcRaiz() {
        double menor = Math.abs(devolverMenor());
        double raiz = Math.sqrt(menor);
        System.out.println("Resultado de la raiz : " + raiz);
    }
}
