package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Correo;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.generic.Command;

public class ModificarCorreoCliente extends Command {
    private final AgenciaId agenciaId;
    private final ClienteId clienteId;
    private final Correo correo;

    public ModificarCorreoCliente(AgenciaId agenciaId, ClienteId clienteId, Correo correo) {
        this.agenciaId = agenciaId;
        this.clienteId = clienteId;
        this.correo = correo;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Correo getCorreo() {
        return correo;
    }
}
