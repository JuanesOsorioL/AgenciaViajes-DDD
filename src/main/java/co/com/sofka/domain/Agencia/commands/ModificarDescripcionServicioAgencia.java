package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Descripcion;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.Command;

public class ModificarDescripcionServicioAgencia extends Command {
    private final AgenciaId agenciaId;
    private final ServicioAgenciaId servicioAgenciaId;
    private final Descripcion descripcion;

    public ModificarDescripcionServicioAgencia(AgenciaId agenciaId, ServicioAgenciaId servicioAgenciaId, Descripcion descripcion) {
        this.agenciaId = agenciaId;
        this.servicioAgenciaId = servicioAgenciaId;
        this.descripcion = descripcion;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public ServicioAgenciaId getServicioAgenciaId() {
        return servicioAgenciaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
