package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.General.Modelo;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class AgregarAvion extends Command {
    private final TransporteId transporteId;
    private final AvionId avionId;
    private final Modelo modelo;
    private final Capacidad capacidad;

    public AgregarAvion(TransporteId transporteId, AvionId avionId, Modelo modelo, Capacidad capacidad) {
        this.transporteId = transporteId;
        this.avionId = avionId;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public TransporteId getTransporteId() {
        return transporteId;
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
