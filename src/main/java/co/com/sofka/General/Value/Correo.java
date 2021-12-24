package co.com.sofka.General.Value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {

    private String correo;

    public Correo(String autor) {
        this.correo = Objects.requireNonNull(autor,"El Correo es requerido");
    }

    @Override
    public String value() {
        return correo;
    }
}
