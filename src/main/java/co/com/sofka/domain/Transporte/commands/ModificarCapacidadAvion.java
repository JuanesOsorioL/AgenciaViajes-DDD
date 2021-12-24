package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Capacidad;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.generic.Command;

public class ModificarCapacidadAvion extends Command {
    private final AvionId avionId;
    private final Capacidad capacidad;

    public ModificarCapacidadAvion(AvionId avionId, Capacidad capacidad) {
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
