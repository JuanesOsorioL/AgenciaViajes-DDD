package co.com.sofka.domain.Hotel.Entity;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.Hotel.value.HabitacionId;
import co.com.sofka.domain.Hotel.value.NumeroCamas;
import co.com.sofka.domain.Hotel.value.Tamano;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Habitacion extends Entity<HabitacionId> {

    private Descripcion descripcion;
    private NumeroCamas numerocamas;
    private Tamano tamano;

    public Habitacion(HabitacionId habitacionId , Descripcion descripcion, NumeroCamas numerocamas,Tamano tamano) {
        super(habitacionId);
        this.descripcion= Objects.requireNonNull(descripcion);
        this.numerocamas= Objects.requireNonNull(numerocamas);
        this.tamano= Objects.requireNonNull(tamano);
    }

    public void ModificarTamaño(Tamano tamano){
        this.tamano = Objects.requireNonNull(tamano);
    }

    public void modificarNumeroCamas(NumeroCamas numerocamas){
        this.numerocamas = Objects.requireNonNull(numerocamas);
    }

    public void modificarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public NumeroCamas numerocamas() {
        return numerocamas;
    }

    public Tamano tamano() {
        return tamano;
    }
}
