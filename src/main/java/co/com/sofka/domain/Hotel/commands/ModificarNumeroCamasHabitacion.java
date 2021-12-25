package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.domain.Hotel.value.HabitacionId;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.NumeroCamas;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCamasHabitacion extends Command {
    private final HotelId hotelId;
    private final HabitacionId habitacionId;
    private final NumeroCamas numerocamas;

    public ModificarNumeroCamasHabitacion(HotelId hotelId, HabitacionId habitacionId, NumeroCamas numerocamas) {
        this.hotelId = hotelId;
        this.habitacionId = habitacionId;
        this.numerocamas = numerocamas;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public HabitacionId getHabitacionId() {
        return habitacionId;
    }

    public NumeroCamas getNumerocamas() {
        return numerocamas;
    }
}
