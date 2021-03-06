package co.com.sofka.domain.Hotel;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Hotel.Entity.Alimentacion;
import co.com.sofka.domain.Hotel.Entity.Habitacion;
import co.com.sofka.domain.Hotel.Entity.ServicioHotel;
import co.com.sofka.domain.Hotel.event.*;
import co.com.sofka.domain.Hotel.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Hotel extends AggregateEvent<HotelId> {

    protected HotelId hotelId;
    protected Nombre nombre;
    protected Set<ServicioHotel> servicioHotel;
    protected Set<Habitacion> habitacion;
    protected Set<Alimentacion> alimentacion;
    protected Descripcion descripcion;


    public Hotel(HotelId hotelId, Nombre nombre, Descripcion descripcion) {
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

    public void modificarNombreHotel(HotelId hotelId, Nombre nombre){
        Objects.requireNonNull(hotelId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreHotelModificado(hotelId,nombre)).apply();
    }

    public void agregarServicioHotel(ServicioHotelId servicioHotelId,Nombre nombre, Descripcion descripcion){
        Objects.requireNonNull(servicioHotelId);
        Objects.requireNonNull(nombre);
        appendChange(new ServicioHotelAgregado(servicioHotelId,nombre,descripcion)).apply();
    }

    public void agregarAlimentacion(AlimentacionId alimentacionId,Tipo tipo, FranjaHoraria franjaHoraria){
        Objects.requireNonNull(alimentacionId);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(franjaHoraria);
        appendChange(new AlimentacionAgregada(alimentacionId, tipo, franjaHoraria)).apply();
    }

    public void agregarHabitacion(HabitacionId habitacionId,Descripcion descripcion, NumeroCamas numerocamas,Tamano tamano){
        Objects.requireNonNull(habitacionId);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(numerocamas);
        Objects.requireNonNull(tamano);
        appendChange(new HabitacionAgregada(habitacionId, descripcion, numerocamas,tamano)).apply();
    }

    public void modificarDescripcion(HotelId hotelId, Descripcion descripcion){
        Objects.requireNonNull(hotelId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionModificada(hotelId, descripcion)).apply();
    }

    public void modificarDescripcionServicioHotel(ServicioHotelId servicioHotelId, Descripcion descripcion){
        Objects.requireNonNull(servicioHotelId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionServicioHotelModificado(servicioHotelId, descripcion)).apply();
    }

    public void modificarNumeroCamasHabitacion(HabitacionId habitacionId, NumeroCamas numerocamas){
        Objects.requireNonNull(habitacionId);
        Objects.requireNonNull(numerocamas);
        appendChange(new NumeroCamasHabitacionModificado(habitacionId, numerocamas)).apply();
    }

    public void modificarTipoAlimentacion(AlimentacionId alimentacionId, Tipo tipo){
        Objects.requireNonNull(alimentacionId);
        Objects.requireNonNull(tipo);
        appendChange(new TipoAlimentacionModificado(alimentacionId, tipo)).apply();
    }

    public Optional<ServicioHotel> buscarServicioHotelPorId(ServicioHotelId servicioHotelId){
        return servicioHotel.stream()
                .filter(servicio->servicio.identity().equals(servicioHotelId)).findFirst();
    }

    public Optional<Habitacion> buscarHabitacionPorId(HabitacionId habitacionId){
        return habitacion.stream()
                .filter(habitacion->habitacion.identity().equals(habitacionId)).findFirst();
    }

    public Optional<Alimentacion> buscarAlimentacionPorId(AlimentacionId alimentacionId){
        return alimentacion.stream()
                .filter(alimentacion->alimentacion.identity().equals(alimentacionId)).findFirst();
    }

    public HotelId hotelId() {
        return hotelId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Set<ServicioHotel> servicioHotel() {
        return servicioHotel;
    }

    public Set<Habitacion> habitacion() {
        return habitacion;
    }

    public Set<Alimentacion> alimentacion() {
        return alimentacion;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
