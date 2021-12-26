package co.com.sofka.usecase.ByCommands.Hotel;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Hotel.Hotel;
import co.com.sofka.domain.Hotel.commands.AgregarHabitacion;


public class AgregarHabitacionHotelUseCase extends UseCase<RequestCommand<AgregarHabitacion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarHabitacion> RequestCommand) {
        var command=RequestCommand.getCommand();
        var hotel=Hotel.from(command.getHotelId(),retrieveEvents(command.getHabitacionId().value()));
        hotel.agregarHabitacion(command.getHabitacionId(),command.getDescripcion(),command.getNumerocamas(), command.getTamano());
        emit().onResponse(new ResponseEvents(hotel.getUncommittedChanges()));
    }
}
