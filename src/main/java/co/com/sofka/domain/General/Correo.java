package co.com.sofka.domain.General;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {

    private final String correo;

    public Correo(String correo){
        this.correo = Objects.requireNonNull(correo);
        if(this.correo.isBlank()){
            throw new IllegalArgumentException("El correo no puede estar vacío");
        }
        if (!this.correo.matches("^\\w+([.-]?\\w+)@\\w+([.-]?\\w+)(.\\w{2,3})+$")) {
            throw new IllegalArgumentException("El correo es invalido");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correo correo1 = (Correo) o;
        return Objects.equals(correo, correo1.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo);
    }

    @Override
    public String value() {
        return correo;
    }
}
