package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Capacidad;
import co.com.sofka.General.Value.Modelo;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.generic.Command;

public class AgregarAvion extends Command {

    private final AvionId avionId;
    private final Modelo modelo;
    private final Capacidad capacidad;

    public AgregarAvion(AvionId avionId, Modelo modelo, Capacidad capacidad) {
        this.avionId = avionId;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
