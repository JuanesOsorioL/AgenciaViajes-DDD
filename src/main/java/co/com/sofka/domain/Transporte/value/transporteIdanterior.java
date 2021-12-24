package co.com.sofka.domain.Transporte.value;

import co.com.sofka.domain.generic.Identity;

public class transporteIdanterior extends Identity {

    private transporteIdanterior(String value){
        super(value);
    }

    public transporteIdanterior(){

    }

    public static transporteIdanterior of(String value){
        return new transporteIdanterior(value);
    }
}
