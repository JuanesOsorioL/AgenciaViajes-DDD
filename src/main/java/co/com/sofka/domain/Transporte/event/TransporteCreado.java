package co.com.sofka.domain.Transporte.event;


import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.DomainEvent;

public class TransporteCreado extends DomainEvent {
    private final Nombre nombre;
    private final TransporteId transporteId;

    public TransporteCreado(TransporteId transporteId, Nombre nombre) {
        super("sofka.Transporte.TransporteCreado");
        this.nombre = nombre;
        this.transporteId = transporteId;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
