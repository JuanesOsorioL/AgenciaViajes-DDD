package co.com.sofka.domain.Hotel.event;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.domain.Hotel.value.ServicioHotelId;
import co.com.sofka.domain.generic.DomainEvent;

public class ServicioHotelAgregado extends DomainEvent {
    private final ServicioHotelId servicioHotelId;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public ServicioHotelAgregado(ServicioHotelId servicioHotelId, Nombre nombre, Descripcion descripcion) {
        super("sofka.Hotel.NombreHotelModificado");
        this.servicioHotelId = servicioHotelId;
        this.nombre = nombre;
        this.descripcion = descripcion;
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
