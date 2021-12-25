package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCamas implements ValueObject<Integer> {
    private Integer numeroCamas;

    public NumeroCamas(Integer numeroCamas) {
        this.numeroCamas = Objects.requireNonNull(numeroCamas,"El Numero de Camas es requerida");
        if(this.numeroCamas<=0){
            throw new IllegalArgumentException("El Numero de camas no puede se cero o negativo");
        }
        if(this.numeroCamas>10){
            throw new IllegalArgumentException("El Numero de camas no puede se mayor a 10");
        }
    }

    @Override
    public Integer value() {
        return numeroCamas;
    }
}
