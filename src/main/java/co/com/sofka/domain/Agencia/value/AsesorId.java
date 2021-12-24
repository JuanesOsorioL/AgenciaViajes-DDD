package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.Identity;

public class AsesorId extends Identity {

    private AsesorId(String value){
        super(value);
    }

    public AsesorId(){

    }

    public static AsesorId of(String value){
        return new AsesorId(value);
    }
}
