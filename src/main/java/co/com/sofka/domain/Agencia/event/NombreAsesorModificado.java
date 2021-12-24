package co.com.sofka.domain.Agencia.event;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreAsesorModificado extends DomainEvent {
    private final AsesorId asesorId;
    private final Nombre nombre;

    public NombreAsesorModificado(AsesorId asesorId, Nombre nombre) {
        super("sofka.Agencia.NombreAsesorModificado");
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
