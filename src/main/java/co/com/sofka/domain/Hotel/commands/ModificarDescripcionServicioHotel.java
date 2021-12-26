package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.ServicioHotelId;
import co.com.sofka.domain.generic.Command;

public class ModificarDescripcionServicioHotel extends Command {
    private final HotelId hotelId;
    private final ServicioHotelId servicioHotelId;
    private final Descripcion descripcion;

    public ModificarDescripcionServicioHotel(HotelId hotelId, ServicioHotelId servicioHotelId, Descripcion descripcion) {
        this.hotelId = hotelId;
        this.servicioHotelId = servicioHotelId;
        this.descripcion = descripcion;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public ServicioHotelId getServicioHotelId() {
        return servicioHotelId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
