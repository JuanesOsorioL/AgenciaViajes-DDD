package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class NumeroPersonas implements ValueObject<String> {

    private final String NumeroPersonas;

    public NumeroPersonas(String NumeroPersonas){
        this.NumeroPersonas = Objects.requireNonNull(NumeroPersonas);
        if(this.NumeroPersonas.isBlank()){
            throw new IllegalArgumentException("El numero de personas no puede estar vacío");
        }
        if(this.NumeroPersonas.length()>2){
            throw new IllegalArgumentException("El numero de personas solo es de 2 cifras");
        }
        if (!this.NumeroPersonas.matches("[0-9]*")){
            throw new IllegalArgumentException("El numero de personas sólo puede incluir números");
        }
        if(Integer.parseInt(this.NumeroPersonas)>11){
            throw new IllegalArgumentException("El numero Maximo de personas son 10");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroPersonas that = (NumeroPersonas) o;
        return Objects.equals(NumeroPersonas, that.NumeroPersonas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NumeroPersonas);
    }

    @Override
    public String value() {
        return NumeroPersonas;
    }
}
