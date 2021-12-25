package co.com.sofka.usecase;

import co.com.sofka.General.Value.Capacidad;
import co.com.sofka.General.Value.Modelo;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Transporte.commands.AgregarCarro;
import co.com.sofka.domain.Transporte.event.CarroAgregado;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgregarCarroTransporteUseCaseTest {

    @Test
    public void agregarCarroTransporte(){
        //arrange
        TransporteId transporteId= TransporteId.of("XXX");
        CarroId carroId=new CarroId();
        Modelo modelo=new Modelo("2010");
        Capacidad capacidad=new Capacidad("100");//no esta definido

        var command=new AgregarCarro(transporteId,carroId,modelo,capacidad);
        var usecase= new AgregarCarroTransporteUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        CarroAgregado event= (CarroAgregado) events.getDomainEvents().get(1);
        Assertions.assertEquals("2010",event.getModelo().value());
        Assertions.assertEquals("100", event.getCapacidad().value());
    }

    }