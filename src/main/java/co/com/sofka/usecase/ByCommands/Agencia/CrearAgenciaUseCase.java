package co.com.sofka.usecase.ByCommands.Agencia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Agencia.Agencia;
import co.com.sofka.domain.Agencia.commands.CrearAgencia;


public class CrearAgenciaUseCase extends UseCase<RequestCommand<CrearAgencia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearAgencia> RequestCommand) {
        var command=RequestCommand.getCommand();
        var agencia=new Agencia(command.getAgenciaId(),
                command.getNombre(),
                command.getDescripcion(),
                command.getDestino());
        emit().onResponse(new ResponseEvents(agencia.getUncommittedChanges()));
    }
}
