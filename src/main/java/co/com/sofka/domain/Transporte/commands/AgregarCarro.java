package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Capacidad;
import co.com.sofka.General.Value.Modelo;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.generic.Command;

public class AgregarCarro extends Command {
    private CarroId carroId;
    private Modelo modelo;
    private Capacidad capacidad;

    public AgregarCarro(CarroId carroId, Modelo modelo, Capacidad capacidad) {
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
