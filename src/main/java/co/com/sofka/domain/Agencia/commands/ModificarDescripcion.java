package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.generic.Command;

public class ModificarDescripcion extends Command {

    private final AgenciaId agenciaId;
    private final Descripcion descripcion;

    public ModificarDescripcion(AgenciaId agenciaId, Descripcion descripcion) {
        this.agenciaId = agenciaId;
        this.descripcion = descripcion;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
