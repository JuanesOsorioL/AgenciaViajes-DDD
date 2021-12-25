package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreHotel implements ValueObject<String> {

    private final String value;

    public NombreHotel(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre hotel no puede estar vacío");
        }

        if(this.value.length()<1){
            throw new IllegalArgumentException("El nombre hotel no puede tener menos de un caracteres");
        }

        if(this.value.length()>50){
            throw new IllegalArgumentException("El comentario hotel no puede tener más de cincuenta caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreHotel that = (NombreHotel) o;
        return Objects.equals(value, that.value);
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
