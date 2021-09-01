package Ej2;

import java.util.ArrayList;

public class Jugador {

    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return nombre  +" "+ id + " mojado:" +  mojado ;
    }

    public boolean disparo(Pistola p) {
        p.llenarPistola();
            if (p.mojar()) {
            mojado = true;
            return true;
        } else {
            mojado = false;
            p.siguienteChorro();
            return false;
    }
}
}
