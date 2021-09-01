package Ej8;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }
    public Cadena(String frase, Integer longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public Integer getLongitud() {
        return longitud;
    }
    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }
    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
}