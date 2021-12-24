package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.Agencia.value.NumeroPersonas;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroPersonasCliente extends Command {
    private final ClienteId clienteId;
    private final NumeroPersonas numeroPersonas;

    public ModificarNumeroPersonasCliente(ClienteId clienteId, NumeroPersonas numeroPersonas) {
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
