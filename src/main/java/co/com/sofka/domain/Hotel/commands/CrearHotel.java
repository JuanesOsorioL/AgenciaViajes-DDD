package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.generic.Command;

public class CrearHotel extends Command {
    private final HotelId hotelId;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public CrearHotel(HotelId hotelId, Nombre nombre, Descripcion descripcion) {
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
