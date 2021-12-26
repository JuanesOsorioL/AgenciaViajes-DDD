package co.com.sofka.usecase;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.domain.Hotel.commands.CrearHotel;
import co.com.sofka.domain.Hotel.event.HotelCreado;
import co.com.sofka.domain.Hotel.value.HotelId;

import co.com.sofka.usecase.ByCommands.CrearHotelUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearHotelUseCaseTest {

    @Test
    public void crearHotel(){

        //arrange
        HotelId hotelId= HotelId.of("FFFF");
        Descripcion descripcion=new Descripcion("Hotel dedicada a crear buenos momentos a nuestros clientes");
        Nombre nombreHotel=new Nombre("Decameron");
        var command=new CrearHotel(hotelId,nombreHotel,descripcion);
        var usecase= new CrearHotelUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        HotelCreado event=(HotelCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("FFFF",event.aggregateRootId());
        Assertions.assertEquals("Decameron",event.getNombre().value());
    }
}