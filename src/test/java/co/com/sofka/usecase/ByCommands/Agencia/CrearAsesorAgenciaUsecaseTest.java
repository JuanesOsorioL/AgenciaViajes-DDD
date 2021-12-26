package co.com.sofka.usecase.ByCommands.Agencia;

import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.General.Correo;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Agencia.commands.CrearAsesor;
import co.com.sofka.domain.Agencia.event.AsesorCreado;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.Agencia.value.Funcion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearAsesorAgenciaUsecaseTest {

    @Test
    public void crearAgencia(){

        //arrange
        AgenciaId agenciaId=AgenciaId.of("xxxx");
        AsesorId asesorId= AsesorId.of("AAA");
        Nombre nombreAsesor=new Nombre("Juan Pablo");
        Celular celularAsesor=new Celular("3113841537");
        Funcion funcion=new Funcion("Ventas de tours");
        Correo correo=new Correo("juanpablo@gmail.com");

        var command=new CrearAsesor(agenciaId,asesorId,nombreAsesor,celularAsesor,correo,funcion);
        var usecase= new CrearAsesorAgenciaUsecase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        AsesorCreado event = (AsesorCreado) events.getDomainEvents().get(1);
        Assertions.assertEquals("AAA",event.getAsesorId().value());
        Assertions.assertEquals("Juan Pablo",event.getNombre().value());
        Assertions.assertEquals("3113841537",event.getCelular().value());
        Assertions.assertEquals("Ventas de tours",event.getFuncion().value());
        Assertions.assertEquals("juanpablo@gmail.com",event.getCorreo().value());
        }
}