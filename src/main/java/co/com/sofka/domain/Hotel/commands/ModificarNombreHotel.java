package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.NombreHotel;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreHotel extends Command {
    private final HotelId hotelId;
    private final NombreHotel nombreHotel;

    public ModificarNombreHotel(HotelId hotelId, NombreHotel nombreHotel) {
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
