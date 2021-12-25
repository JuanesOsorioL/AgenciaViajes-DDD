package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Modelo;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ModificarModeloCarro extends Command {
    private final TransporteId transporteId;
    private final CarroId carroId;
    private final Modelo modelo;

    public ModificarModeloCarro(TransporteId transporteId, CarroId carroId, Modelo modelo) {
        this.transporteId = transporteId;
        this.carroId = carroId;
        this.modelo = modelo;
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
}
