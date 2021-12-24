package co.com.sofka.domain.Transporte.event;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreModificado extends DomainEvent {
    private final co.com.sofka.domain.Transporte.value.transporteId transporteId;
    private final Nombre nombre;

    public NombreModificado(co.com.sofka.domain.Transporte.value.transporteId transporteId, Nombre nombre) {
        super("sofka.Transporte.NombreModificado");
        this.transporteId = transporteId;
        this.nombre = nombre;
    }

    public co.com.sofka.domain.Transporte.value.transporteId getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
