package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.Nombre;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreHotel extends Command {
    private final HotelId hotelId;
    private final Nombre nombreHotel;

    public ModificarNombreHotel(HotelId hotelId, Nombre nombreHotel) {
        this.hotelId = hotelId;
        this.nombreHotel = nombreHotel;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public Nombre getNombreHotel() {
        return nombreHotel;
    }
}
