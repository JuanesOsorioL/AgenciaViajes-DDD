package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.Identity;

public class AgenciaId extends Identity {

    private AgenciaId(String value){
        super(value);
    }

    public AgenciaId(){

    }

    public static AgenciaId of(String value){
        return new AgenciaId(value);
    }
}
