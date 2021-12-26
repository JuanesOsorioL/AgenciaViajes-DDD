package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.domain.General.Modelo;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ModificarModeloAvion extends Command {
    private final TransporteId transporteId;
    private final AvionId avionId;
    private final Modelo modelo;

    public ModificarModeloAvion(TransporteId transporteId, AvionId avionId, Modelo modelo) {
        this.transporteId = transporteId;
        this.avionId = avionId;
        this.modelo = modelo;
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
}
