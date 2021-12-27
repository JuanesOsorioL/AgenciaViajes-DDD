package co.com.sofka.usecase.ByEvent.Hotel;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.Hotel.event.HotelCreado;
import co.com.sofka.domain.Hotel.value.HotelId;

import java.util.List;

public class NotificarHotelUseCasa extends UseCase<TriggeredEvent<HotelCreado>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<HotelCreado> TriggeredEvent) {
        var event=TriggeredEvent.getDomainEvent();
        var service=getService(SendEmailHotelService.class).orElseThrow();
        boolean isValue = service.send(HotelId.of(event.aggregateRootId()),
                "Soporte@Decameron.com",
                "Nuevo hotel Decameron creado: "+event.getHotelId().value());
        if(!isValue)
            throw  new BusinessException(event.aggregateRootId(),"No se puede enviar");
        emit().onResponse(new ResponseEvents(List.of()));
    }

}
