package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class FranjaHoraria implements ValueObject<String> {
    private String franjaHoraria;

    public FranjaHoraria(String franjaHoraria) {
        this.franjaHoraria = Objects.requireNonNull(franjaHoraria,"La Franja Horaria es requerida");
    }

    @Override
    public String value() {
        return franjaHoraria;
    }
}
