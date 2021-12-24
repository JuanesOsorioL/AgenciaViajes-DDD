package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.Hotel.Entity.Alimentacion;
import co.com.sofka.domain.Hotel.Entity.Habitacion;
import co.com.sofka.domain.Hotel.Entity.ServicioHotel;
import co.com.sofka.domain.Transporte.Entity.Avion;
import co.com.sofka.domain.Transporte.Entity.Carro;
import co.com.sofka.domain.Transporte.Entity.Guia;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Set;

public class OVHotel implements ValueObject<OVHotel.Properties> {
    private String HotelID;
    private String nombreHotel;
    protected Set<ServicioHotel>servicio;
    protected Set<Habitacion>habitacion;
    protected Set<Alimentacion>alimentacion;
    private String descripcion;

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String HotelID() {
                return HotelID;
            }

            @Override
            public String nombreHotel() {
                return nombreHotel;
            }

            @Override
            public String descripcion() {
                return descripcion;
            }

            @Override
            public Set<ServicioHotel> servicio() {
                return servicio;
            }

            @Override
            public Set<Habitacion> habitacion() {
                return habitacion;
            }

            @Override
            public Set<Alimentacion> alimentacion() {
                return alimentacion;
            }
        };
    }


    public interface Properties{
        String HotelID();
        String nombreHotel();
        String descripcion();
        Set<ServicioHotel>servicio();
        Set<Habitacion>habitacion();
        Set<Alimentacion>alimentacion();
    }
}
