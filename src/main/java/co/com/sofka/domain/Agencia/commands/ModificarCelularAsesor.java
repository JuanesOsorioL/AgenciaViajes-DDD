package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.generic.Command;

public class ModificarCelularAsesor extends Command {
    private final AsesorId asesorId;
    private final Celular celular;

    public ModificarCelularAsesor(AsesorId asesorId, Celular celular) {
        this.asesorId = asesorId;
        this.celular = celular;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Celular getCelular() {
        return celular;
    }
}
