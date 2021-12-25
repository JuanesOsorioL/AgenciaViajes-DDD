package co.com.sofka.domain.Hotel.event;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionModificada extends DomainEvent {
    private final HotelId hotelId;
    private final Descripcion descripcion;

    public DescripcionModificada(HotelId hotelId, Descripcion descripcion) {
        super("sofka.Hotel.DescripcionModificada");
        this.hotelId = hotelId;
        this.descripcion = descripcion;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
