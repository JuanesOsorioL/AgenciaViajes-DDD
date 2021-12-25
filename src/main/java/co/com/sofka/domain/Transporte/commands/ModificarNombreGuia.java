package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreGuia extends Command {
    private final TransporteId transporteId;
    private final GuiaId guiaId;
    private final Nombre nombre;

    public ModificarNombreGuia(TransporteId transporteId, GuiaId guiaId, Nombre nombre) {
        this.transporteId = transporteId;
        this.guiaId = guiaId;
        this.nombre = nombre;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public GuiaId getGuiaId() {
        return guiaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
