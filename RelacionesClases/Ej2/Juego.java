package Ej2;

import java.util.ArrayList;
import java.util.Iterator;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Pistola pistola;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Pistola pistola) {
        this.jugadores = jugadores;
        this.pistola = pistola;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Pistola getPistola() {
        return pistola;
    }

    public void setPistola(Pistola pistola) {
        this.pistola = pistola;
    }

    @Override
    public String toString() {
        return "Juego: " + jugadores + " pistola :" + pistola;
    }

    public Juego llenarJuego(ArrayList<Jugador> jugadores, Pistola p, Integer n) {
        this.jugadores = jugadores;
        pistola = p;
        return new Juego(jugadores, p);
    }

    public void ronda(Pistola p) {
        boolean mojado = true;
        do {
            Iterator<Jugador> it = jugadores.iterator();
            while (it.hasNext()) {
                Jugador aux = it.next();
                System.out.println("El jugador " + aux.getId() + " se apunta y dispara ---");
                if (aux.disparo(p)) {
                    System.out.println("¡SPLASH! Disparo exitoso");
                    System.out.println("\nGame oveR. El jugador " + aux.getId() + " fue mojado y eliminado");
                    mojado = false;
                    break;
                } else {
                    System.out.println("JuaJua! Ha fallado\n");
                }
            }
        } while (mojado);
    }
}
