package co.com.sofka.domain.Agencia.event;

import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class CelularClienteModificado extends DomainEvent {
    private final ClienteId clienteId;
    private final Celular celular;

    public CelularClienteModificado(ClienteId clienteId, Celular celular) {
        super("sofka.Agencia.NombreClienteModificado");
        this.clienteId = clienteId;
        this.celular = celular;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Celular getCelular() {
        return celular;
    }
}
