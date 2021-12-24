package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.Identity;

public class ServicioId extends Identity {

    private ServicioId(String value){
        super(value);
    }

    public ServicioId(){

    }

    public static ServicioId of(String value){
        return new ServicioId(value);
    }
}
