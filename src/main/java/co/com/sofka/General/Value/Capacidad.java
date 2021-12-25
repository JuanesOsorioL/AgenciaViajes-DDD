package co.com.sofka.General.Value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Capacidad implements ValueObject<String> {

    private String capacidad;

    public Capacidad(String capacidad) {
        this.capacidad = Objects.requireNonNull(capacidad,"La Capacidad es requerida");
    }

    @Override
    public String value() {
        return capacidad;
    }
}
