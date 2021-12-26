package co.com.sofka.usecase.ByCommands.Hotel;


import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Hotel.commands.AgregarAlimentacion;
import co.com.sofka.domain.Hotel.event.AlimentacionAgregada;
import co.com.sofka.domain.Hotel.event.HotelCreado;
import co.com.sofka.domain.Hotel.value.AlimentacionId;
import co.com.sofka.domain.Hotel.value.FranjaHoraria;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.Tipo;
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
class AgregarAlimentacionUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar una Alimentacion en una hotel")
    public void agregarAlimentacion(){

        //arrange
        HotelId hotelId= HotelId.of("AAA");
        AlimentacionId alimentacionId= AlimentacionId.of("AAA");
        Tipo tipo =new Tipo(Tipo.Valor.DESAYUNO);
        FranjaHoraria franjaHoraria =new FranjaHoraria(FranjaHoraria.Valor.MAÑANA);

        var command=new AgregarAlimentacion(hotelId,alimentacionId,tipo,franjaHoraria);
        var usecase= new AgregarAlimentacionUseCase();

        Mockito.when(repository.getEventsBy(alimentacionId.value())).thenReturn(EventStored());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(alimentacionId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assets
        AlimentacionAgregada event= (AlimentacionAgregada) events.get(0);
        Assertions.assertEquals("AAA",event.getAlimentacionId().value());
        Assertions.assertEquals(Tipo.Valor.DESAYUNO,event.getTipo().value());
        Assertions.assertEquals(FranjaHoraria.Valor.MAÑANA,event.getFranjaHoraria().value());
        Mockito.verify(repository).getEventsBy(alimentacionId.value());
    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new HotelCreado(
                        new HotelId(),
                        new Nombre("Decameron"),
                        new Descripcion("Hotel dedicada a crear buenos momentos a nuestros clientes")
                )
        );
    }
}