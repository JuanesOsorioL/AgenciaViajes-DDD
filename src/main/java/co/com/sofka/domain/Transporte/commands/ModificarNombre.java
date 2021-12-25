package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ModificarNombre extends Command {
    private final TransporteId transporteId;
    private final Nombre nombre;

    public ModificarNombre(TransporteId transporteId, Nombre nombre) {
        this.transporteId = transporteId;
        this.nombre = nombre;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
