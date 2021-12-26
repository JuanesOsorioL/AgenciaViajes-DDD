package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ModificarCapacidadAvion extends Command {
    private final TransporteId transporteId;
    private final AvionId avionId;
    private final Capacidad capacidad;

    public ModificarCapacidadAvion(TransporteId transporteId, AvionId avionId, Capacidad capacidad) {
        this.transporteId = transporteId;
        this.avionId = avionId;
        this.capacidad = capacidad;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
