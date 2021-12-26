package co.com.sofka.domain.Hotel.Entity;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Hotel.value.ServicioHotelId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class ServicioHotel extends Entity<ServicioHotelId> {

    private Nombre nombre;
    private Descripcion descripcion;

    public ServicioHotel(ServicioHotelId servicioHotelId , Nombre nombre, Descripcion descripcion) {
        super(servicioHotelId);
        this.nombre= Objects.requireNonNull(nombre);
        this.descripcion= Objects.requireNonNull(descripcion);
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
