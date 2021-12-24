package co.com.sofka.domain.Hotel;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.Entity.ServicioAgencia;
import co.com.sofka.domain.Agencia.value.Descripcion;
import co.com.sofka.domain.Hotel.Entity.Alimentacion;
import co.com.sofka.domain.Hotel.Entity.Habitacion;
import co.com.sofka.domain.Hotel.event.HotelCreado;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Hotel extends AggregateEvent<HotelId> {

    protected HotelId hotelId;
    protected Nombre nombre;
    protected Set<ServicioAgencia> servicio;
    protected Set<Habitacion> habitacion;
    protected Set<Alimentacion> alimentacion;
    protected Descripcion descripcion;


    public Hotel(HotelId hotelId, Nombre nombre,Descripcion descripcion) {
        super(hotelId);
        appendChange(new HotelCreado(hotelId,nombre,descripcion)).apply();
    }

    public Hotel(HotelId hotelId) {
        super(hotelId);
        subscribe(new HotelChange(this));
    }

    public static Hotel from(HotelId hotelId, List<DomainEvent> events){
        var hotel = new Hotel(hotelId);
        events.forEach(hotel::applyEvent);
        return hotel;
    }
}
