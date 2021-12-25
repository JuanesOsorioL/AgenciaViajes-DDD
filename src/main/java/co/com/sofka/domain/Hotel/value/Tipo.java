package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<Tipo.Valor> {

    private final Valor value;

    public Tipo(Valor valor) {
        this.value = valor;
    }

    public enum Valor {
        DESAYUNO,
        ALMUERZO,
        CENA
    }

    @Override
    public Valor value() {
        return value;
    }
}
