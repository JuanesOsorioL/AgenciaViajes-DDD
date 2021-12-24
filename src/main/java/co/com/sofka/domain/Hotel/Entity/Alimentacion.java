package co.com.sofka.domain.Hotel.Entity;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Hotel.value.AlimentacionId;
import co.com.sofka.domain.Hotel.value.FranjaHoraria;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Alimentacion extends Entity<AlimentacionId> {

    private Nombre nombre;
    private FranjaHoraria franjaHoraria;

    public Alimentacion(AlimentacionId alimentacionId ,Nombre nombre, FranjaHoraria franjaHoraria) {
        super(alimentacionId);
        this.nombre= Objects.requireNonNull(nombre);
        this.franjaHoraria= Objects.requireNonNull(franjaHoraria);
    }

    public void ModificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarFranjaHoraria(FranjaHoraria franjaHoraria){
        this.franjaHoraria = Objects.requireNonNull(franjaHoraria);
    }

    public Nombre nombre() {
        return nombre;
    }

    public FranjaHoraria franjaHoraria() {
        return franjaHoraria;
    }
}
