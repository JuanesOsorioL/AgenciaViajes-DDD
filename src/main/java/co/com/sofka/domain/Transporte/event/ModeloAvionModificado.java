package co.com.sofka.domain.Transporte.event;

import co.com.sofka.General.Value.Modelo;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.generic.DomainEvent;

public class ModeloAvionModificado extends DomainEvent {
    private final AvionId avionId;
    private final Modelo modelo;

    public ModeloAvionModificado(AvionId avionId, Modelo modelo) {
        super("sofka.Transporte.ModeloAvionModificado");
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
