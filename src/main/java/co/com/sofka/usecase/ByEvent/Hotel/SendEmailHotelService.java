package co.com.sofka.usecase.ByEvent.Hotel;

import co.com.sofka.domain.Hotel.value.HotelId;

public interface SendEmailHotelService {
    boolean send(HotelId hotelId,String email, String body);
}
