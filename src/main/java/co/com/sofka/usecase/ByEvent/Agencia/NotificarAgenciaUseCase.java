package co.com.sofka.usecase.ByEvent.Agencia;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.Agencia.event.AgenciaCreado;
import co.com.sofka.domain.Agencia.value.AgenciaId;

import java.util.List;

public class NotificarAgenciaUseCase extends UseCase<TriggeredEvent<AgenciaCreado>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<AgenciaCreado> TriggeredEvent) {
        var event=TriggeredEvent.getDomainEvent();
        var service=getService(SendEmailAgenciaService.class).orElseThrow();
        boolean isValue = service.send(AgenciaId.of(event.aggregateRootId()),
                "Soporte@TourViajes.com",
                "Nueva Agencia TourViajes creado: "+event.getAgenciaId().value());
        if(!isValue)
            throw  new BusinessException(event.aggregateRootId(),"No se puede enviar");
        emit().onResponse(new ResponseEvents(List.of()));
    }
}
