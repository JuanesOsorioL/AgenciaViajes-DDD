package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ModificarCelularGuia extends Command {
    private final TransporteId transporteId;
    private final GuiaId guiaId;
    private final Celular celular;

    public ModificarCelularGuia(TransporteId transporteId, GuiaId guiaId, Celular celular) {
        this.transporteId = transporteId;
        this.guiaId = guiaId;
        this.celular = celular;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public GuiaId getGuiaId() {
        return guiaId;
    }

    public Celular getCelular() {
        return celular;
    }
}
