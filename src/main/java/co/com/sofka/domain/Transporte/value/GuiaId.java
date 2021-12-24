package co.com.sofka.domain.Transporte.value;

import co.com.sofka.domain.generic.Identity;

public class GuiaId extends Identity {

    private GuiaId(String value){
        super(value);
    }

    public GuiaId(){

    }

    public static GuiaId of(String value){
        return new GuiaId(value);
    }
}
