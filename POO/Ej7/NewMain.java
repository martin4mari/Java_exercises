package Ej7;

public class NewMain {

    public static void main(String[] args) {
        
        PersonService ps = new PersonService();

      //Person[] personsList= ps.createPersons(4);
        Person[] personsList = ps.crearPersonasTest();
        ps.percentWeight(personsList);
        ps.percentAdults(personsList);
    }
}
