package co.com.sofka.usecase.ByCommands.Hotel;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Hotel.Hotel;
import co.com.sofka.domain.Hotel.commands.AgregarServicioHotel;
import co.com.sofka.domain.Hotel.value.HotelId;


public class AgregarServicioHotelUseCase extends UseCase<RequestCommand<AgregarServicioHotel>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarServicioHotel> RequestCommand) {
        var command=RequestCommand.getCommand();
        var hotel=Hotel.from(command.getHotelId(),retrieveEvents(command.getServicioHotelId().value()));
        hotel.agregarServicioHotel(command.getServicioHotelId(),command.getNombre(),command.getDescripcion());
        emit().onResponse(new ResponseEvents(hotel.getUncommittedChanges()));
    }
}
