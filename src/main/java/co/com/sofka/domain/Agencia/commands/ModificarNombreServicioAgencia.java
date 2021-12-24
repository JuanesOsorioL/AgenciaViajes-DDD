package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreServicioAgencia extends Command {
    private final ServicioAgenciaId servicioAgenciaId;
    private final Nombre nombre;

    public ModificarNombreServicioAgencia(ServicioAgenciaId servicioAgenciaId, Nombre nombre) {
        this.servicioAgenciaId = servicioAgenciaId;
        this.nombre = nombre;
    }

    public ServicioAgenciaId getServicioAgenciaId() {
        return servicioAgenciaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
