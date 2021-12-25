package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.General.Value.Correo;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.Agencia.value.NumeroPersonas;
import co.com.sofka.domain.generic.Command;

public class CrearCliente extends Command {

    private final AgenciaId agenciaId;
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Celular celular;
    private final Correo correo;
    private final NumeroPersonas numeroPersonas;

    public CrearCliente(AgenciaId agenciaId, ClienteId clienteId, Nombre nombre, Celular celular, Correo correo, NumeroPersonas numeroPersonas) {
        this.agenciaId = agenciaId;
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
        this.numeroPersonas = numeroPersonas;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
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
