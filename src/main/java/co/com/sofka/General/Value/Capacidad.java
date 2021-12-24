package co.com.sofka.General.Value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Capacidad implements ValueObject<String> {

    private String capacidad;

    public Capacidad(String autor) {
        this.capacidad = Objects.requireNonNull(capacidad,"El Capacidad es requerido");
    }

    @Override
    public String value() {
        return capacidad;
    }
}
