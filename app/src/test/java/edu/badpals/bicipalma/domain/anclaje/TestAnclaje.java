package edu.badpals.bicipalma.domain.estacion;
import edu.badpals.bicipalma.domain.bicicleta.Bicicleta;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestAnclaje {

    @Test
    public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
    }

    @Test
    public void getBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
        anclaje.getBici();
        assertTrue(anclaje.isOcupado());
    }
}
