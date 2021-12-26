package co.com.sofka.usecase.ByCommands.Hotel;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Hotel.Hotel;
import co.com.sofka.domain.Hotel.commands.AgregarAlimentacion;

public class AgregarAlimentacionUseCase extends UseCase<RequestCommand<AgregarAlimentacion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarAlimentacion> RequestCommand) {
        var command=RequestCommand.getCommand();
        var hotel=Hotel.from(command.getHotelId(),retrieveEvents(command.getAlimentacionId().value()));
        hotel.agregarAlimentacion(command.getAlimentacionId(),command.getTipo(),command.getFranjaHoraria());
        emit().onResponse(new ResponseEvents(hotel.getUncommittedChanges()));
    }
}
