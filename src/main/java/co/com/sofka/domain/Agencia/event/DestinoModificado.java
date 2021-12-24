package co.com.sofka.domain.Agencia.event;

import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Destino;
import co.com.sofka.domain.generic.DomainEvent;

public class DestinoModificado extends DomainEvent {
    private final AgenciaId agenciaId;
    private final Destino destino;

    public DestinoModificado(AgenciaId agenciaId, Destino destino) {
        super("sofka.Agencia.DestinoModificado");
        this.agenciaId = agenciaId;
        this.destino = destino;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public Destino getDestino() {
        return destino;
    }
}
