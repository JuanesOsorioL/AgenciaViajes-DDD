package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.domain.Agencia.value.Descripcion;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.NombreHotel;
import co.com.sofka.domain.generic.Command;

public class CrearHotel extends Command {
    private final HotelId hotelId;
    private final NombreHotel nombreHotel;
    private final Descripcion descripcion;

    public CrearHotel(HotelId hotelId, NombreHotel nombreHotel, Descripcion descripcion) {
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
