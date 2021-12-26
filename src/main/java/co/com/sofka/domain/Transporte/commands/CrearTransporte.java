package co.com.sofka.domain.Transporte.commands;


import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class CrearTransporte extends Command {
    private final Nombre nombre;
    private final TransporteId transporteId;

    public CrearTransporte(TransporteId transporteId, Nombre nombre) {
        this.nombre = nombre;
        this.transporteId = transporteId;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
