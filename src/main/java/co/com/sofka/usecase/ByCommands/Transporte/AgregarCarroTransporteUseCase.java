package co.com.sofka.usecase.ByCommands.Transporte;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Transporte.Transporte;
import co.com.sofka.domain.Transporte.commands.AgregarCarro;

public class AgregarCarroTransporteUseCase extends UseCase<RequestCommand<AgregarCarro>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarCarro> RequestCommand) {
        var command = RequestCommand.getCommand();
        var transporte= Transporte.from(command.getTransporteId(),retrieveEvents(command.getCarroId().value()));
        transporte.agregarCarro(command.getCarroId(),command.getModelo(),command.getCapacidad());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
