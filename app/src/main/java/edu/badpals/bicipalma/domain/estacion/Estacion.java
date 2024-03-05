package edu.badpals.bicipalma.domain.estacion;
import edu.badpals.bicipalma.domain.tarjeta.Autenticacion;
import edu.badpals.bicipalma.domain.bicicleta.Bicicleta;

public class Estacion {

    private final Integer id;
    private final String direccion;
    final Anclajes anclajes;

    public Estacion (Integer id, String direccion, int numeroAnclajes) {

        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numeroAnclajes);
    }

    private Integer getId() {
        return this.id;
    }

    private Anclaje[] anclajes () {
        return this.anclajes.anclajes();

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

    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (Anclaje anclaje : anclajes()) {
            anclajesLibres = anclaje.isOcupado() ? anclajesLibres : ++anclajesLibres;
        }

        return anclajesLibres;
    }

    public void anclarBicicleta (Bicicleta bicicleta){
        for (Anclaje anclaje : anclajes()) {
            if (anclaje.isOcupado()) {
                continue;
            } else { anclaje.anclarBici(bicicleta);
            break;
            }
        }
    }

    public boolean leerTarjetaUsuario(Autenticacion tarjetaUsuario) {
        return tarjetaUsuario.isActivada();
    }

    public void retirarBicicleta (Autenticacion tarjetaUsuario) {
        if (!leerTarjetaUsuario(tarjetaUsuario)) {
            System.out.println("La Tarjeta no Está activada");
        } else {
            for (Anclaje anclaje : anclajes()) {
                if (anclaje.isOcupado()) {
                    anclaje.liberarBici();
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    consulta

    public void consultarAnclajes () {
        System.out.println();
    }
}


