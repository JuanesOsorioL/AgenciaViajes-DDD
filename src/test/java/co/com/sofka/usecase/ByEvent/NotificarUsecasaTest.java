package co.com.sofka.usecase.ByEvent;


import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Hotel.event.HotelCreado;
import co.com.sofka.domain.Hotel.value.HotelId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.refEq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NotificarUsecasaTest {
@Mock
    HotelServicio servicio;

@Test
    void enviarCorreoCliente(){
    HotelId hotelId=HotelId.of("www");
    Nombre nombre=new Nombre("juan");
    Descripcion descripcion=new Descripcion("asdfsdsdsddsdsdsdsdsdsdsdsdsdsdsdsdsefdefrrgvtbvgfvdcvtrbvgtr");
    var event=new HotelCreado( hotelId,  nombre,  descripcion);
    event.setAggregateRootId("ffffff");
    var usecase=new NotificarUsecasa();
    when(servicio.send(
            refEq(AgenciaId.of("ffffff")),
            eq("panama"+hotelId.value())));
    ServiceBuilder builder=new ServiceBuilder();
    builder.addService(servicio);
    usecase.addServiceBuilder(builder);

    var events=UseCaseHandler.getInstance()
            .syncExecutor(usecase,new TriggeredEvent<>(event))
            .orElseThrow();


}




}