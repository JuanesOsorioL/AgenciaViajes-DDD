package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ModificarCapacidadCarro extends Command {
    private final TransporteId transporteId;
    private final CarroId carroId;
    private final Capacidad capacidad;

    public ModificarCapacidadCarro(TransporteId transporteId, CarroId carroId, Capacidad capacidad) {
        this.transporteId = transporteId;
        this.carroId = carroId;
        this.capacidad = capacidad;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public CarroId getCarroId() {
        return carroId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
