package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCamas implements ValueObject<Integer> {
    private Integer numeroCamas;

    public NumeroCamas(Integer numeroCamas) {
        this.numeroCamas = Objects.requireNonNull(numeroCamas,"El NumeroCamas es requerida");
    }

    @Override
    public Integer value() {
        return numeroCamas;
    }
}
