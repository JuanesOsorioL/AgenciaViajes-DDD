package co.com.sofka.usecase.ByCommands.Agencia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Agencia.Agencia;
import co.com.sofka.domain.Agencia.commands.AgregarServicioAgencia;

public class AgregarServicioAgenciaUseCase extends UseCase<RequestCommand<AgregarServicioAgencia>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarServicioAgencia> RequestCommand) {
        var command=RequestCommand.getCommand();
        var agencia= Agencia.from(command.getAgenciaId(),retrieveEvents(command.getServicioAgenciaId().value()));
        agencia.agregarServicioAgencia(command.getServicioAgenciaId(),command.getNombre(),command.getDescripcion());
        emit().onResponse(new ResponseEvents(agencia.getUncommittedChanges()));
    }
}
