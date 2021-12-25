package co.com.sofka.usecase;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Transporte.commands.AgregarGuia;
import co.com.sofka.domain.Transporte.event.GuiaAgregado;
import co.com.sofka.domain.Transporte.value.Edad;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgregarGuiaTransporteUseCaseTest {

    @Test
    public void agregarGuiaTransporte(){
        //arrange
        TransporteId transporteId= TransporteId.of("XXX");
        GuiaId guiaId=new GuiaId();
        Nombre nombre=new Nombre("Sebastian");
        Edad edad=new Edad("26");
        Celular celular=new Celular("1234567890");
        var command=new AgregarGuia(transporteId,guiaId,nombre,edad,celular);
        var usecase= new AgregarGuiaTransporteUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        GuiaAgregado event= (GuiaAgregado) events.getDomainEvents().get(1);
        Assertions.assertEquals("Sebastian",event.getNombre().value());
        Assertions.assertEquals("26", event.getEdad().value());
        Assertions.assertEquals("1234567890", event.getCelular().value());
    }
}