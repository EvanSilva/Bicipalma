package edu.badpals.bicipalma.domain.tarjeta;


public class TarjetaUsuario implements Autenticacion {

    private String id;
    private boolean activada;

    public TarjetaUsuario (String id,boolean activada) {
        this.id = id;
        this.activada = activada;

    }

    public String getId() {
        return this.id;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    @Override
    public boolean isActivada() {
        return this.activada;
    }
}
