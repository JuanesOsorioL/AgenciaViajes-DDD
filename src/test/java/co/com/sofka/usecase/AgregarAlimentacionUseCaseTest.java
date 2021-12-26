package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Hotel.commands.AgregarAlimentacion;
import co.com.sofka.domain.Hotel.event.AlimentacionAgregada;
import co.com.sofka.domain.Hotel.value.AlimentacionId;
import co.com.sofka.domain.Hotel.value.FranjaHoraria;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.Tipo;
import co.com.sofka.usecase.ByCommands.AgregarAlimentacionUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgregarAlimentacionUseCaseTest {

    @Test
    public void agregarAlimentacion(){

        //arrange
        HotelId hotelId= HotelId.of("AAA");
        AlimentacionId alimentacionId=new AlimentacionId();
        Tipo tipo =new Tipo(Tipo.Valor.DESAYUNO);
        FranjaHoraria franjaHoraria =new FranjaHoraria(FranjaHoraria.Valor.MAÑANA);

        var command=new AgregarAlimentacion(hotelId,alimentacionId,tipo,franjaHoraria);
        var usecase= new AgregarAlimentacionUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        AlimentacionAgregada event= (AlimentacionAgregada) events.getDomainEvents().get(1);
        Assertions.assertEquals(Tipo.Valor.DESAYUNO,event.getTipo().value());
        Assertions.assertEquals(Tipo.Valor.DESAYUNO,event.getTipo().value());
    }
}