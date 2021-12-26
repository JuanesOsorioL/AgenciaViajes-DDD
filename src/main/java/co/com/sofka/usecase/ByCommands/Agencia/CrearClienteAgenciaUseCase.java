package co.com.sofka.usecase.ByCommands.Agencia;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Agencia.Agencia;
import co.com.sofka.domain.Agencia.commands.CrearCliente;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Destino;

public class CrearClienteAgenciaUseCase extends UseCase<RequestCommand<CrearCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCliente> RequestCommand) {
        var command=RequestCommand.getCommand();
        var agencia=new Agencia(new AgenciaId(),
                new Nombre("TourViajes"),
                new Descripcion("Empresa dedicada a crear tours para nuestros clientes"),
                new Destino("Panama"));
        agencia.crearCliente(command.getClienteId(),command.getNombre(), command.getCelular(),command.getCorreo(), command.getNumeroPersonas());
        emit().onResponse(new ResponseEvents(agencia.getUncommittedChanges()));
    }
}
