package co.com.sofka.domain.Transporte.event;


import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.General.Modelo;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.generic.DomainEvent;

public class CarroAgregado extends DomainEvent {
    private final CarroId carroId;
    private final Modelo modelo;
    private final Capacidad capacidad;

    public CarroAgregado(CarroId carroId, Modelo modelo, Capacidad capacidad) {
        super("sofka.Transporte.CarroAgregado");
        this.carroId = carroId;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public CarroId getCarroId() {
        return carroId;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
