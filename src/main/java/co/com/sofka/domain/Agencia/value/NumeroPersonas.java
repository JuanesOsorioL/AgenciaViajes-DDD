package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class NumeroPersonas implements ValueObject<Integer> {

    private Integer NumeroPersonas;

    public NumeroPersonas(Integer NumeroPersonas) {
        this.NumeroPersonas = Objects.requireNonNull(NumeroPersonas,"El Numero de Personas es requerida");
    }

    @Override
    public Integer value() {
        return NumeroPersonas;
    }
}
