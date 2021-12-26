package co.com.sofka.usecase.ByCommands.Hotel;


import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Hotel.commands.AgregarHabitacion;
import co.com.sofka.domain.Hotel.event.HabitacionAgregada;
import co.com.sofka.domain.Hotel.event.HotelCreado;
import co.com.sofka.domain.Hotel.value.*;
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
class AgregarHabitacionHotelUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar una Habitacion en una hotel")
    public void agregarHabitacionHotel(){
        //arrange
        HotelId hotelId= HotelId.of("CCC");
        HabitacionId habitacionId= HabitacionId.of("AAA");
        NumeroCamas numeroCamas=new NumeroCamas(1);
        Descripcion HabitacionDescripcion=new Descripcion(
                "Habitacion Pequeña para una pareja");
        Tamano tamano=new Tamano(Tamano.Valor.DOBLE);

        var command=new AgregarHabitacion(hotelId,habitacionId,HabitacionDescripcion,numeroCamas,tamano);
        var usecase= new AgregarHabitacionHotelUseCase();

        Mockito.when(repository.getEventsBy(habitacionId.value())).thenReturn(EventStored());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(habitacionId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assets
        HabitacionAgregada event= (HabitacionAgregada) events.get(0);
        Assertions.assertEquals("AAA",event.getHabitacionId().value());
        Assertions.assertEquals("Habitacion Pequeña para una pareja",event.getDescripcion().value());
        Assertions.assertEquals(
                Tamano.Valor.DOBLE,
                event.getTamano().value());
        Assertions.assertEquals(
                1,
                event.getNumerocamas().value());
        Mockito.verify(repository).getEventsBy(habitacionId.value());
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
