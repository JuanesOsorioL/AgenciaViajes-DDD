package co.com.sofka.usecase.ByCommands.Transporte;


import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Transporte.commands.AgregarGuia;
import co.com.sofka.domain.Transporte.event.GuiaAgregado;
import co.com.sofka.domain.Transporte.event.TransporteCreado;
import co.com.sofka.domain.Transporte.value.Edad;
import co.com.sofka.domain.Transporte.value.GuiaId;
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
class AgregarGuiaTransporteUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar una Guia en una Trasporte")
    public void agregarGuiaTransporte(){
        //arrange
        TransporteId transporteId= TransporteId.of("XXX");
        GuiaId guiaId= GuiaId.of("AAA");
        Nombre nombre=new Nombre("Sebastian");
        Edad edad=new Edad("26");
        Celular celular=new Celular("1234567890");
        var command=new AgregarGuia(transporteId,guiaId,nombre,edad,celular);
        var usecase= new AgregarGuiaTransporteUseCase();

        Mockito.when(repository.getEventsBy(guiaId.value())).thenReturn(EventStored());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(guiaId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assets
        GuiaAgregado event= (GuiaAgregado) events.get(0);
        Assertions.assertEquals("AAA",event.getGuiaId().value());
        Assertions.assertEquals("Sebastian",event.getNombre().value());
        Assertions.assertEquals("26", event.getEdad().value());
        Assertions.assertEquals("1234567890", event.getCelular().value());
        Mockito.verify(repository).getEventsBy(guiaId.value());
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