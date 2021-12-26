package co.com.sofka.domain.Agencia.event;

import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.generic.DomainEvent;

public class CelularAsesorModificado extends DomainEvent {
    private final AsesorId asesorId;
    private final Celular celular;

    public CelularAsesorModificado(AsesorId asesorId, Celular celular) {
        super("sofka.Agencia.CelularAsesorModificado");
        this.asesorId = asesorId;
        this.celular = celular;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Celular getCelular() {
        return celular;
    }
}
