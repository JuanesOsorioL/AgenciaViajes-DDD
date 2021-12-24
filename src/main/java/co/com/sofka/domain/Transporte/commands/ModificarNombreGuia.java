package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreGuia extends Command {
    private final GuiaId guiaId;
    private final Nombre nombre;

    public ModificarNombreGuia(GuiaId guiaId, Nombre nombre) {
        this.guiaId = guiaId;
        this.nombre = nombre;
    }

    public GuiaId getGuiaId() {
        return guiaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
