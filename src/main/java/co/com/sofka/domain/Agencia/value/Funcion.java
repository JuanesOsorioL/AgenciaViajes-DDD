package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Funcion implements ValueObject<String> {
    private String funcion;

    public Funcion(String funcion) {
        this.funcion = Objects.requireNonNull(funcion,"La Funcion es requerida");
    }

    @Override
    public String value() {
        return funcion;
    }


}
