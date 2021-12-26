package co.com.sofka.usecase.ByCommands.Transporte;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Transporte.Transporte;
import co.com.sofka.domain.Transporte.commands.AgregarAvion;


public class AgregarAvionTransporteCaseUse extends UseCase<RequestCommand<AgregarAvion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarAvion> RequestCommand) {
        var command = RequestCommand.getCommand();
        var transporte= Transporte.from(command.getTransporteId(),retrieveEvents(command.getAvionId().value()));
        transporte.agregarAvion(command.getAvionId(),command.getModelo(),command.getCapacidad());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
