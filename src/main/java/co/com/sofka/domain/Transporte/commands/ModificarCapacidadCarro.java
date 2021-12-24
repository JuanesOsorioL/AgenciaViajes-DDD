package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Capacidad;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.generic.Command;

public class ModificarCapacidadCarro extends Command {
    private final CarroId carroId;
    private final Capacidad capacidad;

    public ModificarCapacidadCarro(CarroId carroId, Capacidad capacidad) {
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
