package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.Agencia.value.Descripcion;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.Command;

public class ModificarDescripcionServicioAgencia extends Command {
    private final ServicioAgenciaId servicioAgenciaId;
    private final Descripcion descripcion;

    public ModificarDescripcionServicioAgencia(ServicioAgenciaId servicioAgenciaId, Descripcion descripcion) {
        this.servicioAgenciaId = servicioAgenciaId;
        this.descripcion = descripcion;
    }

    public ServicioAgenciaId getServicioAgenciaId() {
        return servicioAgenciaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
