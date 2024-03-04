package edu.badpals.bicipalma.domain.estacion;
import edu.badpals.bicipalma.domain.bicicleta.Bicicleta;
import edu.badpals.bicipalma.domain.estacion.Anclaje;

public class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes (int numeroAnclajes) {
        this.anclajes = new Anclaje[numeroAnclajes];
    }

    private void crearAnclajes() {
        for (int i=0;i< anclajes.length;i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    Integer numAnclajes () {
        return this.anclajes.length;
    }

    @Override
     public String toString () {
        return "Numero de anclajes: " + Integer.toString(numAnclajes());

     }

     void ocuparAnclaje(int posicionAnclaje, Bicicleta bici) {
        this.anclajes[posicionAnclaje].anclarBici(bici);

    }

    boolean isAnclajeOcupado (int posicionAnclaje) {
        return this.anclajes[posicionAnclaje].isOcupado();
    }

    void liberarAnclaje (int posicionAnclaje) {
        this.anclajes[posicionAnclaje].liberarBici();
    }

    Bicicleta  getBiciAt(int posicionAnclaje) {
       return this.anclajes[posicionAnclaje].getBici();
    }
}

