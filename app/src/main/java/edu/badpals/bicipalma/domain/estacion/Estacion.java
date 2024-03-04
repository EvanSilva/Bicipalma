package edu.badpals.bicipalma.domain.estacion;

public class Estacion {

    private final Integer id;
    private final String direccion;
    private final Anclajes anclajes;


    Estacion (Integer id, String direccion, int numeroAnclajes) {

        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numeroAnclajes);
    }

    private Integer getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    private int numeroAnclajes() {
        return this.anclajes.numAnclajes();
    }

    public String toString() {
        return "id: "+this.getId()+" \ndireccion: "+this.getDireccion()+" \nanclajes: "+this.numeroAnclajes();
    }
 // "id: 1 \ndireccion: Manacor \nanclajes: 6"
}
