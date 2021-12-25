package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.Agencia.value.NumeroPersonas;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroPersonasCliente extends Command {
    private final AgenciaId agenciaId;
    private final ClienteId clienteId;
    private final NumeroPersonas numeroPersonas;

    public ModificarNumeroPersonasCliente(AgenciaId agenciaId, ClienteId clienteId, NumeroPersonas numeroPersonas) {
        this.agenciaId = agenciaId;
        this.clienteId = clienteId;
        this.numeroPersonas = numeroPersonas;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public NumeroPersonas getNumeroPersonas() {
        return numeroPersonas;
    }
}
