package co.com.sofka.domain.Hotel.event;

import co.com.sofka.domain.Hotel.value.HabitacionId;
import co.com.sofka.domain.Hotel.value.NumeroCamas;
import co.com.sofka.domain.generic.DomainEvent;

public class NumeroCamasHabitacionModificado extends DomainEvent {
    private final HabitacionId habitacionId;
    private final NumeroCamas numerocamas;

    public NumeroCamasHabitacionModificado(HabitacionId habitacionId, NumeroCamas numerocamas) {
        super("sofka.Hotel.NumeroCamasHabitacionModificado");
        this.habitacionId = habitacionId;
        this.numerocamas = numerocamas;
    }

    public HabitacionId getHabitacionId() {
        return habitacionId;
    }

    public NumeroCamas getNumerocamas() {
        return numerocamas;
    }
}
