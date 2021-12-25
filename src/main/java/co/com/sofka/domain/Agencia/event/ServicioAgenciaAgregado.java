package co.com.sofka.domain.Agencia.event;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.DomainEvent;

public class ServicioAgenciaAgregado extends DomainEvent {
    private final ServicioAgenciaId id;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public ServicioAgenciaAgregado(ServicioAgenciaId id, Nombre nombre, Descripcion descripcion) {
        super("sofka.Agencia.ServicioAgenciaAgregado");
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public ServicioAgenciaId getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
