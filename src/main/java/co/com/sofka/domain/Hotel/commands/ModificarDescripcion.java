package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.generic.Command;

public class ModificarDescripcion extends Command {
    private final HotelId hotelId;
    private final Descripcion descripcion;

    public ModificarDescripcion(HotelId hotelId, Descripcion descripcion) {
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
