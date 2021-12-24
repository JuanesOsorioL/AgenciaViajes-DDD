package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreAsesor extends Command {
    private final AsesorId asesorId;
    private final Nombre nombre;

    public ModificarNombreAsesor(AsesorId asesorId, Nombre nombre) {
        this.asesorId = asesorId;
        this.nombre = nombre;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
