package co.com.sofka.domain.Agencia.event;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.General.Value.Correo;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.Agencia.value.NumeroPersonas;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Celular celular;
    private final Correo correo;
    private final NumeroPersonas numeroPersonas;

    public ClienteCreado(ClienteId clienteId, Nombre nombre, Celular celular, Correo correo, NumeroPersonas numeroPersonas) {
        super("sofka.Agencia.ClienteCreado");

        this.clienteId = clienteId;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
        this.numeroPersonas = numeroPersonas;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }

    public Correo getCorreo() {
        return correo;
    }

    public NumeroPersonas getNumeroPersonas() {
        return numeroPersonas;
    }
}
