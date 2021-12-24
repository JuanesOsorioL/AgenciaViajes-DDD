package co.com.sofka.domain.Agencia.event;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreServicioAgenciaModificado extends DomainEvent {
    private final ServicioAgenciaId servicioAgenciaId;
    private final Nombre nombre;

    public NombreServicioAgenciaModificado(ServicioAgenciaId servicioAgenciaId, Nombre nombre) {
        super("sofka.Agencia.NombreServicioAgenciaModificado");
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
