package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Modelo;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.generic.Command;

public class ModificarModeloCarro extends Command {
    private final CarroId carroId;
    private final Modelo modelo;

    public ModificarModeloCarro(CarroId carroId, Modelo modelo) {
        this.carroId = carroId;
        this.modelo = modelo;
    }

    public CarroId getCarroId() {
        return carroId;
    }

    public Modelo getModelo() {
        return modelo;
    }
}
