package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tamano implements ValueObject<String> {
    private String tamano;

    public Tamano(String tamano) {
        this.tamano = Objects.requireNonNull(tamano,"El Tamaño es requerido");
    }

    @Override
    public String value() {
        return tamano;
    }
}
