package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.generic.Command;

public class ModificarCelularGuia extends Command {
    private final GuiaId guiaId;
    private final Celular celular;

    public ModificarCelularGuia(GuiaId guiaId, Celular celular) {
        this.guiaId = guiaId;
        this.celular = celular;
    }

    public GuiaId getGuiaId() {
        return guiaId;
    }

    public Celular getCelular() {
        return celular;
    }
}
