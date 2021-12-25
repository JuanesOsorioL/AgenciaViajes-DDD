package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.domain.Agencia.value.Destino;
import co.com.sofka.domain.generic.Command;

public class CrearAgencia extends Command {
    private final AgenciaId agenciaId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Destino destino;

    public CrearAgencia(AgenciaId agenciaId, Nombre nombre, Descripcion descripcion, Destino destino) {
        this.agenciaId = agenciaId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.destino = destino;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Destino getDestino() {
        return destino;
    }
}
