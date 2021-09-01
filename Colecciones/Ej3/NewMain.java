package Ej3;
import java.util.ArrayList;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Alumno al = new Alumno();
        ArrayList<Alumno> grupo = new ArrayList();
        
        String verif;
        do {
            Alumno datos = al.Crear();
            //se agrega de a uno, cada alumno que se crea en datos junto con sus notas(datos). se almacena en forma de lista(grupo)
            grupo.add(datos);
            System.out.println("¿Desea guardar otrx alumnx? (y/n)");
            verif = sc.next().toUpperCase();
        } while (verif.equals("Y"));
        
        System.out.println("Ingrese el nombre para obtener nota final: ");
        String name=sc.next();
        double Promedio=0;
        for (Alumno aux : grupo) {
            if (name.equals(aux.getNombre())){
                Promedio = aux.notaFinal(name);
            }
        }
        System.out.println("Promedio: "+Promedio);
    }
}
