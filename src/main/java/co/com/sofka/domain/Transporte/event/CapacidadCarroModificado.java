package co.com.sofka.domain.Transporte.event;


import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.generic.DomainEvent;

public class CapacidadCarroModificado extends DomainEvent {
    private final CarroId carroId;
    private final Capacidad capacidad;

    public CapacidadCarroModificado(CarroId carroId, Capacidad capacidad) {
        super("sofka.Transporte.CapacidadCarroModificado");
        this.carroId = carroId;
        this.capacidad = capacidad;
    }

    public CarroId getCarroId() {
        return carroId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
