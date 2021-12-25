package co.com.sofka.usecase;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Hotel.Hotel;
import co.com.sofka.domain.Hotel.commands.CrearHotel;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.NombreHotel;

public class AgregarServicioHotelUseCase extends UseCase<RequestCommand<CrearHotel>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearHotel> RequestCommand) {
        var command=RequestCommand.getCommand();
        var hotel=new Hotel(new HotelId(),
                new NombreHotel("Hotel dedicada a crear buenos momentos a nuestros clientes"),
                new Descripcion("Decameron"));

        hotel.agregarServicioHotel(command.getNombreHotel(),command.getDescripcion());



        emit().onResponse(new ResponseEvents(hotel.getUncommittedChanges()));
    }

}
