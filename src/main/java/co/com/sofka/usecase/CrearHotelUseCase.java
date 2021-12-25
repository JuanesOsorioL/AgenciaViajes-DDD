package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Hotel.Hotel;
import co.com.sofka.domain.Hotel.commands.CrearHotel;


public class CrearHotelUseCase extends UseCase<RequestCommand<CrearHotel>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearHotel> RequestCommand) {
        var command=RequestCommand.getCommand();
        var hotel=new Hotel(command.getHotelId(),
                command.getNombreHotel(),
                command.getDescripcion());
        emit().onResponse(new ResponseEvents(hotel.getUncommittedChanges()));
    }
}
