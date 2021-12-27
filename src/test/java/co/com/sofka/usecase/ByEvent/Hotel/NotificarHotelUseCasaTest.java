package co.com.sofka.usecase.ByEvent.Hotel;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Hotel.event.HotelCreado;
import co.com.sofka.domain.Hotel.value.HotelId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NotificarHotelUseCasaTest {
    @Mock
    SendEmailHotelService servicio;
    @Test
    void enviarCorreoHotelCliente(){
        HotelId hotelId = HotelId.of("XXXXXX");
        Nombre nombre=new Nombre("Decameron");
        Descripcion descripcion=new Descripcion("Hotel dedicada a crear buenos momentos a nuestros clientes");
        var event=new HotelCreado( hotelId,  nombre,  descripcion);
        event.setAggregateRootId(hotelId.value());
        var usecase = new NotificarHotelUseCasa();
        when(servicio.send(
                hotelId,
                "Soporte@Decameron.com",
                "Nuevo hotel Decameron creado: "+hotelId.value())).thenReturn(true);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(servicio);
        usecase.addServiceBuilder(builder);

        UseCaseHandler.getInstance()
                .syncExecutor(usecase,new TriggeredEvent<>(event))
                .orElseThrow();

        verify(servicio).send(hotelId,
                "Soporte@Decameron.com",
                "Nuevo hotel Decameron creado: "+hotelId.value());

    }


}