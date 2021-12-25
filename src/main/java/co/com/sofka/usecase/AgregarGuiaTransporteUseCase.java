package co.com.sofka.usecase;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Transporte.Transporte;
import co.com.sofka.domain.Transporte.commands.AgregarGuia;
import co.com.sofka.domain.Transporte.value.TransporteId;

public class AgregarGuiaTransporteUseCase extends UseCase<RequestCommand<AgregarGuia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarGuia> RequestCommand) {
        var command = RequestCommand.getCommand();
        var transporte=new Transporte(new TransporteId(),
                new Nombre("Tourtrans")
        );

        transporte.agregarGuia(command.getNombre(),command.getEdad(),command.getCelular());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
