package co.com.sofka.domain.Hotel.value;


import co.com.sofka.domain.generic.Identity;

public class HotelId extends Identity {

    private HotelId(String value){
        super(value);
    }

    public HotelId(){

    }

    public static HotelId of(String value){
        return new HotelId(value);
    }
}
