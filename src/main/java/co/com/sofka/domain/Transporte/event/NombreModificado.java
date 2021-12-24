package co.com.sofka.domain.Transporte.event;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.transporteIdanterior;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreModificado extends DomainEvent {
    private final transporteIdanterior transporteId;
    private final Nombre nombre;

    public NombreModificado(transporteIdanterior transporteId, Nombre nombre) {
        super("sofka.Transporte.NombreModificado");
        this.transporteId = transporteId;
        this.nombre = nombre;
    }

    public transporteIdanterior getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
