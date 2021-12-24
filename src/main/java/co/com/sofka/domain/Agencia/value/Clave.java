package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Clave implements ValueObject<String> {
    private String clave;

    public Clave(String clave) {
        this.clave = Objects.requireNonNull(clave,"La Clave es requerida");
    }

    @Override
    public String value() {
        return clave;
    }
}
