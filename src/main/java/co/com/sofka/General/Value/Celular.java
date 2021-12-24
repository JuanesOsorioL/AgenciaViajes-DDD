package co.com.sofka.General.Value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Celular implements ValueObject<String> {

    private String celular;

    public Celular(String autor) {
        this.celular = Objects.requireNonNull(autor,"El celular es requerido");
    }

    @Override
    public String value() {
        return celular;
    }
}
