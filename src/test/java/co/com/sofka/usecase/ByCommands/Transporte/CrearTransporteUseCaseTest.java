package co.com.sofka.usecase.ByCommands.Transporte;


import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Transporte.commands.CrearTransporte;
import co.com.sofka.domain.Transporte.event.TransporteCreado;
import co.com.sofka.domain.Transporte.value.TransporteId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearTransporteUseCaseTest {

    @Test
    public void crearTransporte(){

        //arrange
        TransporteId trasporteId= TransporteId.of("aaaaa");
        Nombre nombre=new Nombre("Tourtrans");
        var command=new CrearTransporte(trasporteId,nombre);
        var usecase= new CrearTransporteUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        TransporteCreado event=(TransporteCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("aaaaa",event.aggregateRootId());
        Assertions.assertEquals("Tourtrans",event.getNombre().value());
    }

}