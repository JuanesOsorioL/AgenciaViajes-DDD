package co.com.sofka.domain.Transporte.Entity;

import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.General.Modelo;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.generic.Entity;
import java.util.Objects;


public class Avion extends Entity<AvionId> {

    private Modelo modelo;
    private Capacidad capacidad;

    public Avion(AvionId avionId ,Modelo modelo, Capacidad capacidad) {
        super(avionId);
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
