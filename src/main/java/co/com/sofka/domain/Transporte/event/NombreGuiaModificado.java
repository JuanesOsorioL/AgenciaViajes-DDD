package co.com.sofka.domain.Transporte.event;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreGuiaModificado extends DomainEvent {
    private final GuiaId guiaId;
    private final Nombre nombre;

    public NombreGuiaModificado(GuiaId guiaId, Nombre nombre) {
        super("sofka.Transporte.NombreGuiaModificar");
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
