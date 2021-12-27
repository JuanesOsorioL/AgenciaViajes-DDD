package co.com.sofka.usecase.ByEvent.Agencia;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.Agencia.event.AgenciaCreado;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Destino;
import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NotificarAgenciaUseCaseTest {
    @Mock
    SendEmailAgenciaService servicio;
    @Test
    void enviarCorreoAgenciaCreada(){
        AgenciaId agenciaId = AgenciaId.of("XXXXXX");
        Nombre nombre=new Nombre("TourViajes");
        Descripcion descripcion=new Descripcion("Empresa dedicada a crear tours para nuestros clientes");
        Destino destino=new Destino("Panama");
        var event=new AgenciaCreado( agenciaId,  nombre,  descripcion,destino);
        event.setAggregateRootId(agenciaId.value());
        var usecase = new NotificarAgenciaUseCase();
        when(servicio.send(
                agenciaId,
                "Soporte@TourViajes.com",
                "Nueva Agencia TourViajes creado: "+agenciaId.value())).thenReturn(true);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(servicio);
        usecase.addServiceBuilder(builder);

        UseCaseHandler.getInstance()
                .syncExecutor(usecase,new TriggeredEvent<>(event))
                .orElseThrow();

        verify(servicio).send(agenciaId,
                "Soporte@TourViajes.com",
                "Nueva Agencia TourViajes creado: "+agenciaId.value());
    }
}