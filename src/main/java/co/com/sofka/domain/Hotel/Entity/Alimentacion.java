package co.com.sofka.domain.Hotel.Entity;

import co.com.sofka.domain.Hotel.value.AlimentacionId;
import co.com.sofka.domain.Hotel.value.FranjaHoraria;
import co.com.sofka.domain.Hotel.value.Tipo;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Alimentacion extends Entity<AlimentacionId> {

    private Tipo tipo;
    private FranjaHoraria franjaHoraria;

    public Alimentacion(AlimentacionId alimentacionId , Tipo tipo, FranjaHoraria franjaHoraria) {
        super(alimentacionId);
        this.tipo= Objects.requireNonNull(tipo);
        this.franjaHoraria= Objects.requireNonNull(franjaHoraria);
    }

    public void ModificarTipo(Tipo tipo){
        this.tipo = Objects.requireNonNull(tipo);
    }

    public void modificarFranjaHoraria(FranjaHoraria franjaHoraria){
        this.franjaHoraria = Objects.requireNonNull(franjaHoraria);
    }

    public Tipo tipo() {
        return tipo;
    }

    public FranjaHoraria franjaHoraria() {
        return franjaHoraria;
    }
}
