package co.com.sofka.domain.Hotel.event;

import co.com.sofka.domain.Hotel.value.AlimentacionId;
import co.com.sofka.domain.Hotel.value.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoAlimentacionModificado extends DomainEvent {
    private AlimentacionId alimentacionId;
    private Tipo tipo;

    public TipoAlimentacionModificado(AlimentacionId alimentacionId, Tipo tipo) {
        super("sofka.Hotel.TipoAlimentacionModificado");
        this.alimentacionId = alimentacionId;
        this.tipo = tipo;
    }

    public AlimentacionId getAlimentacionId() {
        return alimentacionId;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
