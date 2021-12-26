package co.com.sofka.usecase.ByCommands.Transporte;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Transporte.Transporte;
import co.com.sofka.domain.Transporte.commands.AgregarGuia;

public class AgregarGuiaTransporteUseCase extends UseCase<RequestCommand<AgregarGuia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarGuia> RequestCommand) {
        var command = RequestCommand.getCommand();
        var transporte= Transporte.from(command.getTransporteId(),retrieveEvents(command.getGuiaId().value()));
        transporte.agregarGuia(command.getGuiaId(),command.getNombre(),command.getEdad(),command.getCelular());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
