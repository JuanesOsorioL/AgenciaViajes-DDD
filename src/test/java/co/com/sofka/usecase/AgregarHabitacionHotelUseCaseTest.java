package co.com.sofka.usecase;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Hotel.commands.AgregarHabitacion;
import co.com.sofka.domain.Hotel.event.HabitacionAgregada;
import co.com.sofka.domain.Hotel.value.*;
import co.com.sofka.usecase.ByCommands.AgregarHabitacionHotelUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AgregarHabitacionHotelUseCaseTest {

    @Test
    public void agregarHabitacionHotel(){
        //arrange
        HotelId hotelId= HotelId.of("CCC");
        HabitacionId habitacionId=new HabitacionId();
        NumeroCamas numeroCamas=new NumeroCamas(1);
        Descripcion HabitacionDescripcion=new Descripcion(
                "Habitacion Pequeña para una pareja");
        Tamano tamano=new Tamano(Tamano.Valor.DOBLE);

        var command=new AgregarHabitacion(hotelId,habitacionId,HabitacionDescripcion,numeroCamas,tamano);
        var usecase= new AgregarHabitacionHotelUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        HabitacionAgregada event= (HabitacionAgregada) events.getDomainEvents().get(1);
        Assertions.assertEquals("Habitacion Pequeña para una pareja",event.getDescripcion().value());
        Assertions.assertEquals(
                Tamano.Valor.DOBLE,
                event.getTamano().value());
        Assertions.assertEquals(
                1,
                event.getNumerocamas().value());
    }

}