package co.com.sofka.domain.General;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Modelo implements ValueObject<String> {

    private final String value;

    public Modelo(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El modelo no puede estar vacío");
        }

        if(this.value.length()<4){
            throw new IllegalArgumentException("El modelo no puede tener menos de cuatro caracteres");
        }

        if(this.value.length()>4){
            throw new IllegalArgumentException("El modelo no puede tener más de cinco caracteres");
        }

        if (!this.value.matches("[0-9]*")){
            throw new IllegalArgumentException("El modelo sólo puede incluir números");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modelo modelo = (Modelo) o;
        return Objects.equals(value, modelo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
