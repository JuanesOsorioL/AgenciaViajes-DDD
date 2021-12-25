package co.com.sofka.usecase;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.General.Value.Correo;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Agencia.commands.CrearCliente;
import co.com.sofka.domain.Agencia.event.ClienteCreado;
import co.com.sofka.domain.Agencia.value.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearClienteAsesorUseCaseTest {

    @Test
    public void crearCliente(){
        //arrange
        AgenciaId agenciaId=AgenciaId.of("xxxx");
        ClienteId clienteId=new ClienteId();
        Nombre nombreCliente=new Nombre("Juan carlos");
        Celular celularAsesor=new Celular("3113841537");
        NumeroPersonas numeroPersonas=new NumeroPersonas("5");
        Correo correo=new Correo("juanCarlos@gmail.com");

        var command=new CrearCliente(agenciaId,clienteId,nombreCliente,celularAsesor,correo,numeroPersonas);
        var usecase= new CrearClienteAsesorUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        ClienteCreado event = (ClienteCreado) events.getDomainEvents().get(1);
        Assertions.assertEquals("Juan carlos",event.getNombre().value());
        Assertions.assertEquals("3113841537",event.getCelular().value());
        Assertions.assertEquals("5",event.getNumeroPersonas().value());
        Assertions.assertEquals("juanCarlos@gmail.com",event.getCorreo().value());
    }

}