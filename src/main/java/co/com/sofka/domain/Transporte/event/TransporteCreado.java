package co.com.sofka.domain.Transporte.event;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.transporteIdanterior;
import co.com.sofka.domain.generic.DomainEvent;

public class TransporteCreado extends DomainEvent {
    private final Nombre nombre;
    private final transporteIdanterior transporteId;

    public TransporteCreado(transporteIdanterior transporteId, Nombre nombre) {
        super("sofka.Transporte.TransporteCreado");
        this.nombre = nombre;
        this.transporteId = transporteId;
    }

    public transporteIdanterior getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
