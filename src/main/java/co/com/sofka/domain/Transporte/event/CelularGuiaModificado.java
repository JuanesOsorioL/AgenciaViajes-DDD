package co.com.sofka.domain.Transporte.event;


import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CelularGuiaModificado extends DomainEvent {
    private final GuiaId guiaId;
    private final Celular celular;

    public CelularGuiaModificado(GuiaId guiaId, Celular celular) {
        super("sofka.Transporte.CelularGuiaModificar");
        this.guiaId = guiaId;

        this.celular = celular;
    }

    public GuiaId getGuiaId() {
        return guiaId;
    }

    public Celular getCelular() {
        return celular;
    }
}
