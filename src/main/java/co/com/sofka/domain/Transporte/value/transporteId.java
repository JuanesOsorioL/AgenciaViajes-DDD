package co.com.sofka.domain.Transporte.value;

import co.com.sofka.domain.generic.Identity;

public class transporteId extends Identity {

    private transporteId(String value){
        super(value);
    }

    public transporteId(){

    }

    public static transporteId of(String value){
        return new transporteId(value);
    }
}
