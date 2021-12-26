package co.com.sofka.usecase.ByCommands.Agencia;


import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.Agencia.commands.AgregarServicioAgencia;
import co.com.sofka.domain.Agencia.event.AgenciaCreado;
import co.com.sofka.domain.Agencia.event.ServicioAgenciaAgregado;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Destino;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AgregarServicioAgenciaUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar un Servicio en una Agencia")
    public void agregarServicioAgencia(){
        //arrange
        String descripcion="visitar los sitios turisticos del sector, contamos con un transporte amplio y comodo";
        AgenciaId agenciaId=AgenciaId.of("xxxx");
        ServicioAgenciaId servicioAgenciaId = ServicioAgenciaId.of("AAA");
        Descripcion ServicioDescripcion=new Descripcion(descripcion);
        Nombre ServicioNombre=new Nombre("visita cultural");

        var command=new AgregarServicioAgencia(agenciaId,servicioAgenciaId,ServicioNombre,ServicioDescripcion);
        var usecase= new AgregarServicioAgenciaUseCase();

        Mockito.when(repository.getEventsBy(servicioAgenciaId.value())).thenReturn(EventStored());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(servicioAgenciaId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assets
        ServicioAgenciaAgregado event= (ServicioAgenciaAgregado) events.get(0);
        Assertions.assertEquals("AAA",event.getAgenciaId().value());
        Assertions.assertEquals("visita cultural",event.getNombre().value());
        Assertions.assertEquals(descripcion,event.getDescripcion().value());
        Mockito.verify(repository).getEventsBy(servicioAgenciaId.value());

    }
    private List<DomainEvent> EventStored() {
        return List.of(
                new AgenciaCreado(
                        new AgenciaId(),
                        new Nombre("TourViajes"),
                        new Descripcion("Empresa dedicada a crear tours para nuestros clientes"),
                        new Destino("Panama"))
        );
    }
}