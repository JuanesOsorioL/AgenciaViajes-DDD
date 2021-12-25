package co.com.sofka.domain.Hotel.event;

import co.com.sofka.domain.Agencia.value.Descripcion;
import co.com.sofka.domain.Hotel.value.ServicioHotelId;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionServicioHotelModificado extends DomainEvent {
    private final ServicioHotelId servicioHotelId;
    private final Descripcion descripcion;

    public DescripcionServicioHotelModificado(ServicioHotelId servicioHotelId, Descripcion descripcion) {
        super("sofka.Hotel.DescripcionServicioHotelModificado");
        this.servicioHotelId = servicioHotelId;
        this.descripcion = descripcion;
    }

    public ServicioHotelId getServicioHotelId() {
        return servicioHotelId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
