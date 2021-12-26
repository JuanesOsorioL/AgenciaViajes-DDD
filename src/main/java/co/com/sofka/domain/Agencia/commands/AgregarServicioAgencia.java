package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.Command;

public class AgregarServicioAgencia extends Command {
    private final ServicioAgenciaId servicioAgenciaId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final AgenciaId agenciaId;

    public AgregarServicioAgencia(AgenciaId agenciaId,ServicioAgenciaId servicioAgenciaId, Nombre nombre, Descripcion descripcion) {
        this.agenciaId = agenciaId;
        this.servicioAgenciaId = servicioAgenciaId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public ServicioAgenciaId getServicioAgenciaId() {
        return servicioAgenciaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }
}
