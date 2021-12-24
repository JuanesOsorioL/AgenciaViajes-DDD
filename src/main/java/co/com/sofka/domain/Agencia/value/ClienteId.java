package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.Identity;


public class ClienteId extends Identity {

    private ClienteId(String value){
        super(value);
    }

    public ClienteId(){

    }

    public static ClienteId of(String value){
        return new ClienteId(value);
    }
}
