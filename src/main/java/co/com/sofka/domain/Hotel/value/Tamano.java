package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tamano implements ValueObject<Tamano.Valor> {

    private final Valor value;

    public Tamano(Valor valor) {
        this.value = valor;
    }

    @Override
    public Valor value() {
        return value;
    }

    public enum Valor {
        SENCILLA,
        DOBLE,
        EXTRADOBLE
    }


}
