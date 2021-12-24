package co.com.sofka.domain.Transporte.value;

import co.com.sofka.domain.generic.Identity;

public class CarroId extends Identity {

    private CarroId(String value){
        super(value);
    }

    public CarroId(){

    }

    public static CarroId of(String value){
        return new CarroId(value);
    }
}
