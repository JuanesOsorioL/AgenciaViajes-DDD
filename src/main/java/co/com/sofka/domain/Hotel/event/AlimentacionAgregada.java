package co.com.sofka.domain.Hotel.event;

import co.com.sofka.domain.Hotel.value.AlimentacionId;
import co.com.sofka.domain.Hotel.value.FranjaHoraria;
import co.com.sofka.domain.Hotel.value.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class AlimentacionAgregada extends DomainEvent {
    private final AlimentacionId alimentacionId;
    private final Tipo tipo;
    private final FranjaHoraria franjaHoraria;

    public AlimentacionAgregada(AlimentacionId alimentacionId, Tipo tipo, FranjaHoraria franjaHoraria) {
        super("sofka.Hotel.AlimentacionAgregada");
        this.alimentacionId = alimentacionId;
        this.tipo = tipo;
        this.franjaHoraria = franjaHoraria;
    }

    public AlimentacionId getAlimentacionId() {
        return alimentacionId;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public FranjaHoraria getFranjaHoraria() {
        return franjaHoraria;
    }
}
