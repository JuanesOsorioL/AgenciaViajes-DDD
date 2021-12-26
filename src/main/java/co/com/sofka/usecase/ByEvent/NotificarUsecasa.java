package co.com.sofka.usecase.ByEvent;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Hotel.event.HotelCreado;

import java.util.List;

public class NotificarUsecasa extends UseCase<TriggeredEvent<HotelCreado>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<HotelCreado> TriggeredEvent) {
        var event=TriggeredEvent.getDomainEvent();

        var service=getService(HotelServicio.class).orElseThrow();

        boolean isValue=service.send(AgenciaId.of(event.aggregateRootId()),
                "panama"+event.getHotelId().value());
        if(!isValue)
            throw  new BusinessException(event.aggregateRootId(),"  no se puede enviar");
        emit().onResponse(new ResponseEvents(List.of()));
    }

}
