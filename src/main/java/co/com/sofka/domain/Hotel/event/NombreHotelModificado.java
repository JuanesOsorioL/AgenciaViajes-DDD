package co.com.sofka.domain.Hotel.event;

import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.NombreHotel;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreHotelModificado extends DomainEvent {
    private final HotelId hotelId;
    private final NombreHotel nombreHotel;

    public NombreHotelModificado(HotelId hotelId, NombreHotel nombreHotel) {
        super("sofka.Hotel.NombreHotelModificado");
        this.hotelId = hotelId;
        this.nombreHotel = nombreHotel;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public NombreHotel getNombreHotel() {
        return nombreHotel;
    }
}
