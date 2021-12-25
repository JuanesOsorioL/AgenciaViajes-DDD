package co.com.sofka.General.Value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Celular implements ValueObject<String> {

    private final String celular;

    public Celular(String celular){
        this.celular = Objects.requireNonNull(celular);
        if(this.celular.isBlank()){
            throw new IllegalArgumentException("El teléfono no puede estar vacío");
        }
        if(this.celular.length()<7){
            throw new IllegalArgumentException("El teléfono no puede tener menos de siete digitos");
        }
        if(this.celular.length()>10){
            throw new IllegalArgumentException("El teléfono no puede tener más de diez digitos");
        }
        if (!this.celular.matches("[0-9]*")){
            throw new IllegalArgumentException("El teléfono sólo puede incluir números");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Celular celular1 = (Celular) o;
        return Objects.equals(celular, celular1.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(celular);
    }

    @Override
    public String value() {
        return celular;
    }
}
