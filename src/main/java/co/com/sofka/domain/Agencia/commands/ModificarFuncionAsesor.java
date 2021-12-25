package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.Agencia.value.Funcion;
import co.com.sofka.domain.generic.Command;

public class ModificarFuncionAsesor extends Command {
    private final AgenciaId agenciaId;
    private final AsesorId asesorId;
    private final Funcion funcion;

    public ModificarFuncionAsesor(AgenciaId agenciaId, AsesorId asesorId, Funcion funcion) {
        this.agenciaId = agenciaId;
        this.asesorId = asesorId;
        this.funcion = funcion;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
