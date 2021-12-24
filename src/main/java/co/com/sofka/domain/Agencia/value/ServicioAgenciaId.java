package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.Identity;

public class ServicioAgenciaId extends Identity {

    private ServicioAgenciaId(String value){
        super(value);
    }

    public ServicioAgenciaId(){

    }

    public static ServicioAgenciaId of(String value){
        return new ServicioAgenciaId(value);
    }
}
