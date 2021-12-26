package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.General.Modelo;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class AgregarCarro extends Command {
    private final TransporteId transporteId;
    private final CarroId carroId;
    private final Modelo modelo;
    private final Capacidad capacidad;

    public AgregarCarro(TransporteId transporteId, CarroId carroId, Modelo modelo, Capacidad capacidad) {
        this.transporteId = transporteId;
        this.carroId = carroId;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public TransporteId getTransporteId() {
        return transporteId;
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
