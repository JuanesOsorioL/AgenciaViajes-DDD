package co.com.sofka.domain.Agencia.event;

import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.Agencia.value.NumeroPersonas;
import co.com.sofka.domain.generic.DomainEvent;

public class NumeroPersonasClienteModificado extends DomainEvent {
    private final ClienteId clienteId;
    private final NumeroPersonas numeroPersonas;

    public NumeroPersonasClienteModificado(ClienteId clienteId, NumeroPersonas numeroPersonas) {
        super("sofka.Agencia.NumeroPersonasClienteModificado");
        this.clienteId = clienteId;
        this.numeroPersonas = numeroPersonas;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public NumeroPersonas getNumeroPersonas() {
        return numeroPersonas;
    }
}
