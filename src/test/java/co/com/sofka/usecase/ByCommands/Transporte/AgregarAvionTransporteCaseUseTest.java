package co.com.sofka.usecase.ByCommands.Transporte;


import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.General.Modelo;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Transporte.commands.AgregarAvion;
import co.com.sofka.domain.Transporte.event.AvionAgregado;
import co.com.sofka.domain.Transporte.event.TransporteCreado;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
@ExtendWith(MockitoExtension.class)
class AgregarAvionTransporteCaseUseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar un Avion en una Trasporte")
    public void agregarAvionTransporte(){
        //arrange
        TransporteId transporteId= TransporteId.of("XXX");
        AvionId avionId= AvionId.of("AAA");
        Modelo modelo=new Modelo("2010");
        Capacidad capacidad=new Capacidad("100");

        var command=new AgregarAvion(transporteId,avionId,modelo,capacidad);
        var usecase= new AgregarAvionTransporteCaseUse();

        Mockito.when(repository.getEventsBy(avionId.value())).thenReturn(EventStored());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(avionId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assets
        AvionAgregado event= (AvionAgregado) events.get(0);
        Assertions.assertEquals("AAA",event.getAvionId().value());
        Assertions.assertEquals("2010",event.getModelo().value());
        Assertions.assertEquals("100", event.getCapacidad().value());
        Mockito.verify(repository).getEventsBy(avionId.value());
    }
    private List<DomainEvent> EventStored() {
        return List.of(
                new TransporteCreado(
                        new TransporteId(),
                        new Nombre("Tourtrans")
                )
        );
    }
}