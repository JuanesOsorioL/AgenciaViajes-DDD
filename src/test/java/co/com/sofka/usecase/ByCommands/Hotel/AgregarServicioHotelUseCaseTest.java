package co.com.sofka.usecase.ByCommands.Hotel;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Hotel.commands.AgregarServicioHotel;
import co.com.sofka.domain.Hotel.event.HotelCreado;
import co.com.sofka.domain.Hotel.event.ServicioHotelAgregado;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.ServicioHotelId;
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
class AgregarServicioHotelUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar un Servicio en una hotel")
    public void agregarServicioHotel(){

        //arrange
        HotelId hotelId= HotelId.of("AAA");
        ServicioHotelId servicioHotelId= ServicioHotelId.of("AAA");
        Nombre nombreServicio=new Nombre("Gymnacio");
        Descripcion ServicioDescripcion=new Descripcion(
                "Contamos con un Gymnacio para nuestros clientes se mantengan siempre en forma");

        var command=new AgregarServicioHotel(hotelId,servicioHotelId,nombreServicio,ServicioDescripcion);
        var usecase= new AgregarServicioHotelUseCase();

        Mockito.when(repository.getEventsBy(servicioHotelId.value())).thenReturn(EventStored());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(servicioHotelId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assets
        ServicioHotelAgregado event= (ServicioHotelAgregado) events.get(0);
        Assertions.assertEquals("AAA",event.getServicioHotelId().value());
        Assertions.assertEquals("Gymnacio",event.getNombre().value());
        Assertions.assertEquals(
                "Contamos con un Gymnacio para nuestros clientes se mantengan siempre en forma",
                event.getDescripcion().value());
        Mockito.verify(repository).getEventsBy(servicioHotelId.value());
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