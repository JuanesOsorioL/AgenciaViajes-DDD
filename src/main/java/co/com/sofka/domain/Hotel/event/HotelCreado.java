package co.com.sofka.domain.Hotel.event;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.NombreHotel;
import co.com.sofka.domain.generic.DomainEvent;

public class HotelCreado extends DomainEvent {
    private final HotelId hotelId;
    private final NombreHotel nombreHotel;
    private final Descripcion descripcion;

    public HotelCreado(HotelId hotelId, NombreHotel nombreHotel, Descripcion descripcion) {
        super("sofka.Hotel.HotelCreado");
        this.hotelId = hotelId;
        this.nombreHotel = nombreHotel;
        this.descripcion = descripcion;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public NombreHotel getNombreHotel() {
        return nombreHotel;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
