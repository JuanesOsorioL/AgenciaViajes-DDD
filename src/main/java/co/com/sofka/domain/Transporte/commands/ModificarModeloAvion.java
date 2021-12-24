package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Modelo;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.generic.Command;

public class ModificarModeloAvion extends Command {
    private final AvionId avionId;
    private final Modelo modelo;

    public ModificarModeloAvion(AvionId avionId, Modelo modelo) {
        this.avionId = avionId;
        this.modelo = modelo;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public Modelo getModelo() {
        return modelo;
    }
}
