package co.com.sofka.domain.Agencia.event;

import co.com.sofka.domain.Agencia.value.Descripcion;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionServicioAgenciaModificado extends DomainEvent {
    private final ServicioAgenciaId servicioAgenciaId;
    private final Descripcion descripcion;

    public DescripcionServicioAgenciaModificado(ServicioAgenciaId servicioAgenciaId, Descripcion descripcion) {
        super("sofka.Agencia.DescripcionServicioAgenciaModificado");
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
