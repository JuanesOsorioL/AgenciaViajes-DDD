package co.com.sofka.domain.Transporte.value;

import co.com.sofka.domain.generic.Identity;

public class AvionId extends Identity {

    private AvionId(String value){
        super(value);
    }

    public AvionId(){

    }

    public static AvionId of(String value){
        return new AvionId(value);
    }
}
