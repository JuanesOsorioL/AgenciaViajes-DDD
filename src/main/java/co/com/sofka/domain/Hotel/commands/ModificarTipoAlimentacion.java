package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.domain.Hotel.value.AlimentacionId;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.Tipo;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoAlimentacion extends Command {

    private final HotelId hotelId;
    private AlimentacionId alimentacionId;
    private Tipo tipo;

    public ModificarTipoAlimentacion(HotelId hotelId, AlimentacionId alimentacionId, Tipo tipo) {
        this.hotelId = hotelId;
        this.alimentacionId = alimentacionId;
        this.tipo = tipo;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public AlimentacionId getAlimentacionId() {
        return alimentacionId;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
