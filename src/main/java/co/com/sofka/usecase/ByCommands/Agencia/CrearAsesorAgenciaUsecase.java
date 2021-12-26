package co.com.sofka.usecase.ByCommands.Agencia;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Agencia.Agencia;
import co.com.sofka.domain.Agencia.commands.CrearAsesor;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Destino;


public class CrearAsesorAgenciaUsecase extends UseCase<RequestCommand<CrearAsesor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearAsesor> RequestCommand) {
        var command=RequestCommand.getCommand();
        var agencia=new Agencia(new AgenciaId(),
                new Nombre("TourViajes"),
                new Descripcion("Empresa dedicada a crear tours para nuestros clientes"),
                new Destino("Panama"));

        agencia.crearAsesor(command.getAsesorId(),command.getNombre(), command.getCelular(), command.getCorreo(), command.getFuncion());
        emit().onResponse(new ResponseEvents(agencia.getUncommittedChanges()));
    }
}
