package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.generic.Command;

public class ModificarCelularCliente extends Command {
    private final AgenciaId agenciaId;
    private final ClienteId clienteId;
    private final Celular celular;

    public ModificarCelularCliente(AgenciaId agenciaId, ClienteId clienteId, Celular celular) {
        this.agenciaId = agenciaId;
        this.clienteId = clienteId;
        this.celular = celular;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Celular getCelular() {
        return celular;
    }
}
