package co.com.sofka.usecase;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Transporte.commands.CrearTransporte;
import co.com.sofka.domain.Transporte.Transporte;

public class CrearTransporteUseCase extends UseCase<RequestCommand<CrearTransporte>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearTransporte> RequestCommand) {
        var command=RequestCommand.getCommand();
        var transporte=new Transporte(command.getTransporteId(),command.getNombre());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));

    }
}
