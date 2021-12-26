package co.com.sofka.usecase.ByCommands.Agencia;

import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Agencia.commands.CrearAgencia;
import co.com.sofka.domain.Agencia.event.AgenciaCreado;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Destino;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearAgenciaUseCaseTest {

    @Test
    public void crearAgencia(){
        //arrange
        AgenciaId agenciaId=AgenciaId.of("xxxx");
        Nombre nombre=new Nombre("TourViajes");
        Descripcion descripcion=new Descripcion("Empresa dedicada a crear tours para nuestros clientes");
        Destino destino=new Destino("Panama");
        var command=new CrearAgencia(agenciaId,nombre,descripcion,destino);
        var usecase= new CrearAgenciaUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        AgenciaCreado event = (AgenciaCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx",event.aggregateRootId());
        Assertions.assertEquals("TourViajes",event.getNombre().value());
        Assertions.assertEquals("Panama",event.getDestino().value());
    }
}