package co.com.sofka.usecase;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Agencia.commands.AgregarServicioAgencia;
import co.com.sofka.domain.Agencia.event.ServicioAgenciaAgregado;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AgregarServicioAgenciaUseCaseTest {

    @Test
    public void agregarServicioAgencia(){
        //arrange
        String descripcion="visitar los sitios turisticos del sector, contamos con un transporte amplio y comodo";
        AgenciaId agenciaId=AgenciaId.of("xxxx");
        ServicioAgenciaId servicioAgenciaId = new ServicioAgenciaId();
        Descripcion ServicioDescripcion=new Descripcion(descripcion);
        Nombre ServicioNombre=new Nombre("visita cultural");

        var command=new AgregarServicioAgencia(agenciaId,servicioAgenciaId,ServicioNombre,ServicioDescripcion);
        var usecase= new AgregarServicioAgenciaUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        ServicioAgenciaAgregado event= (ServicioAgenciaAgregado) events.getDomainEvents().get(1);
        Assertions.assertEquals("visita cultural",event.getNombre().value());
        Assertions.assertEquals(descripcion,event.getDescripcion().value());

    }
}