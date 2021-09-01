package Ej1;
public class Herencia {
    
    public static void main(String[] args) {
        
        Animal perro = new Perro("Chiquito","chisitos",4,"beagle");
        perro.alimentar();
        
       Perro perro1 = new Perro ("Rompeportones","chorizo",7,"doberman");
       perro1.alimentar();
       
       Animal gato = new Gato("Zucarita","gallinas", 12,"tricolor");
       gato.alimentar();
       
       Animal caballo= new Caballo("Lgante","pasto puna", 16, "dothraki");
       caballo.alimentar();
    }
}
