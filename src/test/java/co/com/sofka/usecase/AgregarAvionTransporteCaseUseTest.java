package co.com.sofka.usecase;

import co.com.sofka.General.Value.Capacidad;
import co.com.sofka.General.Value.Modelo;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Transporte.commands.AgregarAvion;
import co.com.sofka.domain.Transporte.event.AvionAgregado;
import co.com.sofka.domain.Transporte.value.AvionId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgregarAvionTransporteCaseUseTest {

    @Test
    public void agregarAvionTransporte(){
        //arrange
        TransporteId transporteId= TransporteId.of("XXX");
        AvionId avionId=new AvionId();
        Modelo modelo=new Modelo("2010");
        Capacidad capacidad=new Capacidad("100");//no esta definido

        var command=new AgregarAvion(transporteId,avionId,modelo,capacidad);
        var usecase= new AgregarAvionTransporteCaseUse();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        AvionAgregado event= (AvionAgregado) events.getDomainEvents().get(1);
        Assertions.assertEquals("2010",event.getModelo().value());
        Assertions.assertEquals("100", event.getCapacidad().value());
    }
}