package co.com.sofka.domain.Transporte.Entity;

import co.com.sofka.General.Value.Capacidad;
import co.com.sofka.General.Value.Modelo;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Carro extends Entity<CarroId> {

    private Modelo modelo;
    private Capacidad capacidad;

    public Carro(CarroId carroId ,Modelo modelo, Capacidad capacidad) {
        super(carroId);
        this.modelo= Objects.requireNonNull(modelo);
        this.capacidad= Objects.requireNonNull(capacidad);
    }

    public void modificarModelo(Modelo modelo){
        this.modelo = Objects.requireNonNull(modelo);
    }

    public void modificarCapacidad(Capacidad capacidad){
        this.capacidad = Objects.requireNonNull(capacidad);
    }

    public Modelo modelo() {
        return modelo;
    }

    public Capacidad capacidad() {
        return capacidad;
    }
}
