package com.alejandro.futbol.app;

import com.alejandro.futbol.domain.EquipoDeFutbol;
import com.alejandro.futbol.domain.Jugador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppFutbol {
    public static void main(String[] args) {
        Jugador duque = new Jugador();
        duque.nombre = "Jeferson";
        duque.posicion = "Delantero";

        Jugador aristi = new Jugador();
        aristi.nombre = "Victor Aristizabal";
        aristi.posicion = "DELANTERO";

        Jugador mac = new Jugador();
        aristi.nombre = "Macnelly Torres";
        aristi.posicion = "Creativo";

        Jugador cardona = new Jugador();
        cardona.nombre = "Cardona";
        cardona.posicion = "Creativo";

        EquipoDeFutbol nacional = new EquipoDeFutbol();
        nacional.nombre = "Atl. Nacional";
        nacional.jugadores = new ArrayList<>(Arrays.asList(duque,aristi,mac));

        EquipoDeFutbol boca = new EquipoDeFutbol();
        boca.nombre = "boca Juniors";
        boca.jugadores = new ArrayList<>();

        nacional.entrenar("guarne");
        nacional.jugarPartido("Miami", boca);

        System.out.println("Boca antes de comprar" + boca.jugadores.size());
        boca.comprarJugador(cardona, 500000);
        nacional.venderJugador(duque, 800000, boca);
        System.out.println(boca.jugadores.size());

        nacional.mostrarDelanteros();

    }
}
