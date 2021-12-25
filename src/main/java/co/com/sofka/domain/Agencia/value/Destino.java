package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Destino implements ValueObject<String> {


    private final String value;

    public Destino(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El destino no puede estar vacío");
        }
        if(this.value.length()<3){
            throw new IllegalArgumentException("El destino no puede tener menos de tres caracteres");
        }
        if(this.value.length()>50){
            throw new IllegalArgumentException("El destino no puede tener más de cincuenta caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destino destino = (Destino) o;
        return Objects.equals(value, destino.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return null;
    }


}
