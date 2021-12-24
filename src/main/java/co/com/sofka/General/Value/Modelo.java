package co.com.sofka.General.Value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Modelo implements ValueObject<String> {

    private String modelo;

    public Modelo(String autor) {
        this.modelo = Objects.requireNonNull(modelo,"El Modelo es requerido");
    }

    @Override
    public String value() {
        return modelo;
    }
}
