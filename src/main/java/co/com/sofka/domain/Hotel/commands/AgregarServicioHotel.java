package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.ServicioHotelId;
import co.com.sofka.domain.generic.Command;

public class AgregarServicioHotel extends Command {
    private final HotelId hotelId;
    private final ServicioHotelId servicioHotelId;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public AgregarServicioHotel(HotelId hotelId, ServicioHotelId servicioHotelId, Nombre nombre, Descripcion descripcion) {
        this.hotelId = hotelId;
        this.servicioHotelId = servicioHotelId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public ServicioHotelId getServicioHotelId() {
        return servicioHotelId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
