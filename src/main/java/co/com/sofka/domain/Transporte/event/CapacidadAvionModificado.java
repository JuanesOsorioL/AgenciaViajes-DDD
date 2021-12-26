package co.com.sofka.domain.Transporte.event;


import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.generic.DomainEvent;

public class CapacidadAvionModificado extends DomainEvent {
    private final AvionId avionId;
    private final Capacidad capacidad;

    public CapacidadAvionModificado(AvionId avionId, Capacidad capacidad) {
        super("sofka.Transporte.CapacidadAvionModificado");
        this.avionId = avionId;
        this.capacidad = capacidad;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}

