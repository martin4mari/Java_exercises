package Ej7;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

public class PersonService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    final int LOW_BMI = -1;
    final int IDEAL_BMI = 0;
    final int HIGH_BMI = 1;

    public Person createPerson() {
        System.out.println("Ingresar nombre completo");
        String name = sc.next();
        System.out.println("Ingresar edad");
        int age = sc.nextInt();
        char g = ' ';
        char gender = ' ';
        do {
            System.out.println("Ingresar genero. Male (M), Female(F), NonBinary(N)");
            g = toUpperCase(sc.next().charAt(0));
            if ('M' == g || 'F' == g || 'N' == g) {
                gender = g;
            } else {
                System.out.println("No corresponde el caracter ");
            }
        } while (!('M' == g || 'F' == g || 'N' == g));

        System.out.println("Ingrese su peso en Kg");
        double weight = sc.nextDouble();
        System.out.println("Ingrese su altura en Mts");
        double height = sc.nextDouble();
        return new Person(name, age, gender, weight, height);
    }

    public int calcBMI(Person p) {
        double w = p.getWeight();
        double h = p.getHeight();
        double BMI = w / Math.pow(h, 2);
        if (BMI < 20) {
            return LOW_BMI;
        } else if (BMI <= 25 && BMI >= 20) {
            return IDEAL_BMI;
        } else {
            return HIGH_BMI;
        }
    }

    public boolean adult(Person p) {
        return p.getAge() >= 18;
    }

    public Person[] createPersons(int n) {
        Person[] persons = new Person[n];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = createPerson();
        }
        return persons;
    }

    public void percentWeight(Person[] persons) {
        int c1 = 0;
        int c0 = 0;
        int c_1 = 0;
        int nPeople = persons.length;
        for (Person p : persons) {
            switch (calcBMI(p)) {
                case 1:
                    System.out.println(p.getName() + " se encuenta por encima de su peso ideal.");
                    c1++;
                    break;
                case 0:
                    System.out.println(p.getName() + " se encuenta en peso ideal.");
                    c0++;
                    break;
                case -1:
                    System.out.println(p.getName() + " se encuenta por debajo de su peso ideal.");
                    c_1++;
                    break;
            }
        }
        System.out.println("¡Esto no es un indice exacto! Consulte un medicx para mas diagnostico preciso\n");
        System.out.println("El " + (c1 * 100 / nPeople) + " % personas tiene un BMI por encima de su peso ideal");
        System.out.println("El " + (c0 * 100 / nPeople) + " % personas tiene un BMI en su peso ideal");
        System.out.println("El " + (c_1 * 100 / nPeople) + " % personas tiene un BMI por debajo de su peso ideal\n");
    }

    public void percentAdults(Person[] persons) {
        int nPeople = persons.length;
        int cMajor = 0;
        for (Person p : persons) {
            if (adult(p)) {
                cMajor++;
                System.out.println(p.getName() + " es mayor de edad");
            } else {
                System.out.println(p.getName() + " es menor de edad");
            }
        }
        System.out.println((cMajor * 100 / nPeople) + "% de las personas es mayor de edad");
        System.out.println(((nPeople - cMajor) * 100 / nPeople) + "% de las personas es menor de edad");
    }

    public Person[] crearPersonasTest() {
        Person[] persons = new Person[4];
        persons[0] = new Person("Agustina", 27, 'F', 76.0, 1.3);
        persons[1] = new Person("Juan Fernando", 16, 'M', 100.0, 1.3);
        persons[2] = new Person("Piero", 90, 'M', 59.5, 1.7);
        persons[3] = new Person("Anastasia", 40, 'n', 60, 1.4);
        return persons;
    }
}
