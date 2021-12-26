package co.com.sofka.usecase.ByCommands.Transporte;


import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.General.Modelo;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Transporte.commands.AgregarCarro;
import co.com.sofka.domain.Transporte.event.CarroAgregado;
import co.com.sofka.domain.Transporte.event.TransporteCreado;
import co.com.sofka.domain.Transporte.value.CarroId;
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
class AgregarCarroTransporteUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar un Carro en una Trasporte")
    public void agregarCarroTransporte(){
        //arrange
        TransporteId transporteId= TransporteId.of("XXX");
        CarroId carroId= CarroId.of("AAA");
        Modelo modelo=new Modelo("2010");
        Capacidad capacidad=new Capacidad("100");//no esta definido

        var command=new AgregarCarro(transporteId,carroId,modelo,capacidad);
        var usecase= new AgregarCarroTransporteUseCase();

        Mockito.when(repository.getEventsBy(carroId.value())).thenReturn(EventStored());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(carroId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assets
        CarroAgregado event= (CarroAgregado) events.get(0);
        Assertions.assertEquals("AAA",event.getCarroId().value());
        Assertions.assertEquals("2010",event.getModelo().value());
        Assertions.assertEquals("100", event.getCapacidad().value());
        Mockito.verify(repository).getEventsBy(carroId.value());
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