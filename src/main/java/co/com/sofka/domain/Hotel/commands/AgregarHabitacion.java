package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.domain.Hotel.value.HabitacionId;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.NumeroCamas;
import co.com.sofka.domain.Hotel.value.Tamano;
import co.com.sofka.domain.generic.Command;

public class AgregarHabitacion extends Command {

    private final HotelId hotelId;
    private final HabitacionId habitacionId;
    private final Descripcion descripcion;
    private final NumeroCamas numerocamas;
    private final Tamano tamano;

    public AgregarHabitacion(HotelId hotelId, HabitacionId habitacionId, Descripcion descripcion, NumeroCamas numerocamas, Tamano tamano) {
        this.hotelId = hotelId;
        this.habitacionId = habitacionId;
        this.descripcion = descripcion;
        this.numerocamas = numerocamas;
        this.tamano = tamano;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public HabitacionId getHabitacionId() {
        return habitacionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public NumeroCamas getNumerocamas() {
        return numerocamas;
    }

    public Tamano getTamano() {
        return tamano;
    }
}
