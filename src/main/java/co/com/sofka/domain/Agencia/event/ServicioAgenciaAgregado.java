package co.com.sofka.domain.Agencia.event;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.DomainEvent;

public class ServicioAgenciaAgregado extends DomainEvent {
    private final ServicioAgenciaId agenciaId;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public ServicioAgenciaAgregado(ServicioAgenciaId id, Nombre nombre, Descripcion descripcion) {
        super("sofka.Agencia.ServicioAgenciaAgregado");
        this.agenciaId = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public ServicioAgenciaId getAgenciaId() {
        return agenciaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
