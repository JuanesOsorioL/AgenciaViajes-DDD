package co.com.sofka.domain.Hotel.event;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Hotel.value.HotelId;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreHotelModificado extends DomainEvent {
    private final HotelId hotelId;
    private final Nombre nombre;

    public NombreHotelModificado(HotelId hotelId, Nombre nombre) {
        super("sofka.Hotel.NombreHotelModificado");
        this.hotelId = hotelId;
        this.nombre = nombre;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
