package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreServicioAgencia extends Command {
    private final AgenciaId agenciaId;
    private final ServicioAgenciaId servicioAgenciaId;
    private final Nombre nombre;

    public ModificarNombreServicioAgencia(AgenciaId agenciaId, ServicioAgenciaId servicioAgenciaId, Nombre nombre) {
        this.agenciaId = agenciaId;
        this.servicioAgenciaId = servicioAgenciaId;
        this.nombre = nombre;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public ServicioAgenciaId getServicioAgenciaId() {
        return servicioAgenciaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
