package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.transporteIdanterior;
import co.com.sofka.domain.generic.Command;

public class CrearTransporte extends Command {
    private final Nombre nombre;
    private final transporteIdanterior transporteId;

    public CrearTransporte(transporteIdanterior transporteId, Nombre nombre) {
        this.nombre = nombre;
        this.transporteId = transporteId;
    }

    public transporteIdanterior getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
