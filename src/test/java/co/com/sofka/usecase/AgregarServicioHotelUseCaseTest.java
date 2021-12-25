package co.com.sofka.usecase;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Hotel.commands.AgregarServicioHotel;
import co.com.sofka.domain.Hotel.event.ServicioHotelAgregado;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.ServicioHotelId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgregarServicioHotelUseCaseTest {

    @Test
    public void agregarServicioHotel(){

        //arrange
        HotelId hotelId= HotelId.of("AAA");
        ServicioHotelId servicioHotelId=new ServicioHotelId();
        Nombre nombreServicio=new Nombre("Gymnacio");
        Descripcion ServicioDescripcion=new Descripcion(
                "Contamos con un Gymnacio para nuestros clientes se mantengan siempre en forma");

        var command=new AgregarServicioHotel(hotelId,servicioHotelId,nombreServicio,ServicioDescripcion);
        var usecase= new AgregarServicioHotelUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        ServicioHotelAgregado event= (ServicioHotelAgregado) events.getDomainEvents().get(1);
        Assertions.assertEquals("Gymnacio",event.getNombre().value());
        Assertions.assertEquals(
                "Contamos con un Gymnacio para nuestros clientes se mantengan siempre en forma",
                event.getDescripcion().value());
    }
}