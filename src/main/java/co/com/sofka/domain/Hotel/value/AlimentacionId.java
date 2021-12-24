package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.Identity;

public class AlimentacionId extends Identity {

    private AlimentacionId(String value){
        super(value);
    }

    public AlimentacionId(){

    }

    public static AlimentacionId of(String value){
        return new AlimentacionId(value);
    }
}
