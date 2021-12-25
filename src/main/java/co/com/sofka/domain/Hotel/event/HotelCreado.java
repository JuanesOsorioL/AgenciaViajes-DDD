package co.com.sofka.domain.Hotel.event;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Hotel.value.HotelId;

import co.com.sofka.domain.generic.DomainEvent;

public class HotelCreado extends DomainEvent {
    private final HotelId hotelId;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public HotelCreado(HotelId hotelId, Nombre nombre, Descripcion descripcion) {
        super("sofka.Hotel.HotelCreado");
        this.hotelId = hotelId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
