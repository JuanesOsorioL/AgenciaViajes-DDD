package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.generic.Command;

public class ModificarNombre extends Command {
    private co.com.sofka.domain.Transporte.value.transporteId transporteId;
    private Nombre nombre;

    public ModificarNombre(co.com.sofka.domain.Transporte.value.transporteId transporteId, Nombre nombre) {
        this.transporteId = transporteId;
        this.nombre = nombre;
    }

    public co.com.sofka.domain.Transporte.value.transporteId getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
