package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.generic.Command;

public class CrearTransporte extends Command {
    private final Nombre nombre;
    private final co.com.sofka.domain.Transporte.value.transporteId transporteId;

    public CrearTransporte(co.com.sofka.domain.Transporte.value.transporteId transporteId, Nombre nombre) {
        this.nombre = nombre;
        this.transporteId = transporteId;
    }

    public co.com.sofka.domain.Transporte.value.transporteId getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
