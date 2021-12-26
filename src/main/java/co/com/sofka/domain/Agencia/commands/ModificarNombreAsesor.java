package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreAsesor extends Command {

    private final AgenciaId agenciaId;
    private final AsesorId asesorId;
    private final Nombre nombre;

    public ModificarNombreAsesor(AgenciaId agenciaId, AsesorId asesorId, Nombre nombre) {
        this.agenciaId = agenciaId;
        this.asesorId = asesorId;
        this.nombre = nombre;
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
}
