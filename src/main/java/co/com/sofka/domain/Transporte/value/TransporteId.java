package co.com.sofka.domain.Transporte.value;

import co.com.sofka.domain.generic.Identity;

public class TransporteId extends Identity {

    private TransporteId(String value){
        super(value);
    }

    public TransporteId(){

    }

    public static TransporteId of(String value){
        return new TransporteId(value);
    }
}
