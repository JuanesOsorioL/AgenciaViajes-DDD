package co.com.sofka.usecase;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Transporte.commands.CrearTransporte;
import co.com.sofka.domain.Transporte.event.TransporteCreado;
import co.com.sofka.domain.Transporte.value.transporteIdanterior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearTransporteUseCaseTest {

    @Test
    public void crearTransporte(){

        //arrange
        transporteIdanterior trasporteId= transporteIdanterior.of("aaaaa");
        Nombre nombre=new Nombre("nombre");
        var command=new CrearTransporte(trasporteId,nombre);
        var usecase= new CrearTransporteUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        TransporteCreado event=(TransporteCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("aaaaa",event.aggregateRootId());
    }

}