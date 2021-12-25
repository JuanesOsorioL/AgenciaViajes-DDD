package co.com.sofka.usecase;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Transporte.Transporte;
import co.com.sofka.domain.Transporte.commands.AgregarAvion;
import co.com.sofka.domain.Transporte.value.TransporteId;

public class AgregarAvionTransporteCaseUse extends UseCase<RequestCommand<AgregarAvion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarAvion> RequestCommand) {
        var command = RequestCommand.getCommand();
        var transporte=new Transporte(new TransporteId(),
                new Nombre("Tourtrans")
        );

        transporte.agregarAvion(command.getModelo(),command.getCapacidad());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
