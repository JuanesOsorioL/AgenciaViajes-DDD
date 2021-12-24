package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.transporteIdanterior;
import co.com.sofka.domain.generic.Command;

public class ModificarNombre extends Command {
    private transporteIdanterior transporteId;
    private Nombre nombre;

    public ModificarNombre(transporteIdanterior transporteId, Nombre nombre) {
        this.transporteId = transporteId;
        this.nombre = nombre;
    }

    public transporteIdanterior getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
