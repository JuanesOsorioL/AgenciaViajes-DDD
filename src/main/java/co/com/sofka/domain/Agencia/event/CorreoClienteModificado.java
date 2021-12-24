package co.com.sofka.domain.Agencia.event;

import co.com.sofka.General.Value.Correo;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class CorreoClienteModificado extends DomainEvent {
    private final ClienteId clienteId;
    private final Correo correo;

    public CorreoClienteModificado(ClienteId clienteId, Correo correo) {
        super("sofka.Agencia.AgenciaCreado");
        this.clienteId = clienteId;
        this.correo = correo;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Correo getCorreo() {
        return correo;
    }
}
