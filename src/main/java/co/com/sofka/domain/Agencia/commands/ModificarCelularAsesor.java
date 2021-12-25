package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.generic.Command;

public class ModificarCelularAsesor extends Command {
    private final AgenciaId agenciaId;
    private final AsesorId asesorId;
    private final Celular celular;

    public ModificarCelularAsesor(AgenciaId agenciaId, AsesorId asesorId, Celular celular) {
        this.agenciaId = agenciaId;
        this.asesorId = asesorId;
        this.celular = celular;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Celular getCelular() {
        return celular;
    }
}
