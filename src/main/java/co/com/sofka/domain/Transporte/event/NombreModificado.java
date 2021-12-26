package co.com.sofka.domain.Transporte.event;


import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreModificado extends DomainEvent {
    private final TransporteId transporteId;
    private final Nombre nombre;

    public NombreModificado(TransporteId transporteId, Nombre nombre) {
        super("sofka.Transporte.NombreModificado");
        this.transporteId = transporteId;
        this.nombre = nombre;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
