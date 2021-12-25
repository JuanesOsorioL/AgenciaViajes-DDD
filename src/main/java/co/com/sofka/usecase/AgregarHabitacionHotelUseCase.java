package co.com.sofka.usecase;

import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.Hotel.Hotel;
import co.com.sofka.domain.Hotel.commands.AgregarHabitacion;
import co.com.sofka.domain.Hotel.value.HotelId;

public class AgregarHabitacionHotelUseCase extends UseCase<RequestCommand<AgregarHabitacion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarHabitacion> RequestCommand) {
        var command=RequestCommand.getCommand();
        var hotel=new Hotel(new HotelId(),
                new Nombre("Decameron"),
                new Descripcion("Hotel dedicada a crear buenos momentos a nuestros clientes"));

        hotel.agregarHabitacion(command.getDescripcion(),command.getNumerocamas(), command.getTamano());

        emit().onResponse(new ResponseEvents(hotel.getUncommittedChanges()));
    }
}
