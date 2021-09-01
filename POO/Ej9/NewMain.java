package Ej9;

public class NewMain {

    public static void main(String[] args) {
        Matematica m = new Matematica();

        double num1 = Math.random()*100;
        double num2 = Math.random()*100;
        m.setNum1(num1);
        m.setNum2(num2); 
        System.out.println(m.getNum1());
        System.out.println(m.getNum2());
        
        m.calcPotencia();
        m.calcRaiz();
    }
}
