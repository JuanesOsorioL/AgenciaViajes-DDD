package co.com.sofka.usecase;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Agencia.Agencia;
import co.com.sofka.domain.Agencia.commands.AgregarServicioAgencia;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Destino;

public class AgregarServicioAgenciaUseCase extends UseCase<RequestCommand<AgregarServicioAgencia>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarServicioAgencia> RequestCommand) {
        var command=RequestCommand.getCommand();
        var agencia=new Agencia(new AgenciaId(),
                new Nombre("TourViajes"),
                new Descripcion("Empresa dedicada a crear tours para nuestros clientes"),
                new Destino("Panama"));

        agencia.agregarServicioAgencia(command.getNombre(),command.getDescripcion());

        emit().onResponse(new ResponseEvents(agencia.getUncommittedChanges()));

    }
}
