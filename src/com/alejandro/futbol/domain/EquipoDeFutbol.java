package com.alejandro.futbol.domain;

import java.util.List;

public class EquipoDeFutbol {
    public String nombre;
    public String pais;
    public short anioDeFundacion;
    public short numeroDeTitulos;
    public List<Jugador> jugadores;

    public void entrenar(String lugar){
        System.out.println(this.nombre + "Esta entrenado en " + lugar);
    }
    public boolean jugarPartido(String lugar, EquipoDeFutbol contrario) {
        System.out.println(this.nombre + "Esta jugando en " + lugar + "contra" + contrario.nombre);
        return true;
    }

    public Jugador comprarJugador(Jugador jugador, int precio){
        jugadores.add(jugador);
        return jugador;
    }
    public void venderJugador(Jugador jugador, int precio, EquipoDeFutbol destino) {
    this.jugadores.remove(jugador);
    destino.jugadores.add(jugador);
    }
    public void mostrarDelanteros(){
        jugadores.forEach(jugador -> {
            if(jugador.posicion.equalsIgnoreCase("Delantero")){
                System.out.println(jugador.nombre);
            }
        });

    }
}

