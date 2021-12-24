package co.com.sofka.domain.Transporte.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Edad implements ValueObject<String> {
    private String edad;

    public Edad(String funcion) {
        this.edad = Objects.requireNonNull(funcion,"La Edad es requerida");
    }

    @Override
    public String value() {
        return edad;
    }
}
