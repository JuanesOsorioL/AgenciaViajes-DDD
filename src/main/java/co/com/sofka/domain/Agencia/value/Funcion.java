package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Funcion implements ValueObject<String> {
    private final String value;

    public Funcion(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La funcion no puede estar vacío");
        }
        if(this.value.length()<3){
            throw new IllegalArgumentException("La funcion no puede tener menos de tres caracteres");
        }
        if(this.value.length()>100){
            throw new IllegalArgumentException("La funcion no puede tener más de cien caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcion funcion = (Funcion) o;
        return Objects.equals(value, funcion.value);
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
