package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.Identity;

public class ServicioHotelId extends Identity {

    private ServicioHotelId(String value){
        super(value);
    }

    public ServicioHotelId(){

    }

    public static ServicioHotelId of(String value){
        return new ServicioHotelId(value);
    }
}
