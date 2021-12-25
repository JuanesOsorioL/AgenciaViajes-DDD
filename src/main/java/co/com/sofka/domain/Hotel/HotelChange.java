package co.com.sofka.domain.Hotel;

import co.com.sofka.domain.Hotel.Entity.Alimentacion;
import co.com.sofka.domain.Hotel.Entity.Habitacion;
import co.com.sofka.domain.Hotel.Entity.ServicioHotel;
import co.com.sofka.domain.Hotel.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class HotelChange extends EventChange {
    public HotelChange(Hotel hotel) {

        apply((HotelCreado event) -> {
            hotel.hotelId=event.getHotelId();
            hotel.nombreHotel= event.getNombreHotel();
            hotel.descripcion= event.getDescripcion();
            hotel.servicioHotel = new HashSet<>();
            hotel.habitacion = new HashSet<>();
            hotel.alimentacion = new HashSet<>();
        });

        apply((NombreHotelModificado event) -> {
            hotel.nombreHotel=event.getNombreHotel();
        });

        apply((ServicioHotelAgregado event) -> {
            hotel.servicioHotel.add(new ServicioHotel(
                    event.getServicioHotelId(),
                    event.getNombre(),
                    event.getDescripcion()
            ));
        });

        apply((AlimentacionAgregada event) -> {
            hotel.alimentacion.add(new Alimentacion(
                    event.getAlimentacionId(),
                    event.getTipo(),
                    event.getFranjaHoraria()
            ));
        });

        apply((HabitacionAgregada event) -> {
            hotel.habitacion.add(new Habitacion(
                    event.getHabitacionId(),
                    event.getDescripcion(),
                    event.getNumerocamas(),
                    event.getTamano()
            ));
        });

        apply((DescripcionModificada event) -> {
            hotel.descripcion=event.getDescripcion();
        });

        apply((DescripcionServicioHotelModificado event) -> {
            var servicioHotel = hotel.buscarServicioHotelPorId(event.getServicioHotelId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el Servicio hotel"));
            servicioHotel.modificarDescripcion(event.getDescripcion());
        });

        apply((NumeroCamasHabitacionModificado event) -> {
            var habitacion = hotel.buscarHabitacionPorId(event.getHabitacionId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra la habitacion"));
            habitacion.modificarNumeroCamas(event.getNumerocamas());
        });

        apply((TipoAlimentacionModificado event) -> {
            var alimentacion = hotel.buscarAlimentacionPorId(event.getAlimentacionId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra la alimentacion"));
            alimentacion.ModificarTipo(event.getTipo());
        });
    }
}
