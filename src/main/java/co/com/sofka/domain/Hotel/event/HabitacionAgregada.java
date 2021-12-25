package co.com.sofka.domain.Hotel.event;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.domain.Hotel.value.HabitacionId;
import co.com.sofka.domain.Hotel.value.NumeroCamas;
import co.com.sofka.domain.Hotel.value.Tamano;
import co.com.sofka.domain.generic.DomainEvent;

public class HabitacionAgregada extends DomainEvent {
    private final HabitacionId habitacionId;
    private final Descripcion descripcion;
    private final NumeroCamas numerocamas;
    private final Tamano tamano;

    public HabitacionAgregada(HabitacionId habitacionId, Descripcion descripcion, NumeroCamas numerocamas, Tamano tamano) {
        super("sofka.Hotel.HabitacionAgregada");
        this.habitacionId = habitacionId;
        this.descripcion = descripcion;
        this.numerocamas = numerocamas;
        this.tamano = tamano;
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
