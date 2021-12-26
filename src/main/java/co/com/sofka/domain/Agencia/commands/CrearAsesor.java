package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.General.Correo;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.Agencia.value.Funcion;
import co.com.sofka.domain.generic.Command;

public class CrearAsesor extends Command {
    private final AgenciaId agenciaId;
    private final AsesorId asesorId;
    private final Nombre nombre;
    private final Celular celular;
    private final Correo correo;
    private final Funcion funcion;

    public CrearAsesor(AgenciaId agenciaId, AsesorId asesorId, Nombre nombre, Celular celular, Correo correo, Funcion funcion) {
        this.agenciaId = agenciaId;
        this.asesorId = asesorId;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
        this.funcion = funcion;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public AsesorId getAsesorId() {
        return asesorId;
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

    public Funcion getFuncion() {
        return funcion;
    }
}
