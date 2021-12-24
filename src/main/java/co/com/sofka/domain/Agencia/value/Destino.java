package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Destino implements ValueObject<String> {
    private String destino;

    public Destino(String destino) {
        this.destino = Objects.requireNonNull(destino,"El Destino es requerida");
    }

    @Override
    public String value() {
        return destino;
    }
}
