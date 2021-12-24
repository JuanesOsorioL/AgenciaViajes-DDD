package co.com.sofka.General.Value;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private String nombre;

    public Nombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre,"El nombre es requerido");
    }

    @Override
    public String value() {
        return nombre;
    }
}
