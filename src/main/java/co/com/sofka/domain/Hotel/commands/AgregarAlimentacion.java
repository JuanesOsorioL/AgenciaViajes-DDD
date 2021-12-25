package co.com.sofka.domain.Hotel.commands;

import co.com.sofka.domain.Hotel.value.AlimentacionId;
import co.com.sofka.domain.Hotel.value.FranjaHoraria;
import co.com.sofka.domain.Hotel.value.HotelId;
import co.com.sofka.domain.Hotel.value.Tipo;
import co.com.sofka.domain.generic.Command;

public class AgregarAlimentacion extends Command {
    private final HotelId hotelId;
    private final AlimentacionId alimentacionId;
    private final Tipo tipo;
    private final FranjaHoraria franjaHoraria;

    public AgregarAlimentacion(HotelId hotelId, AlimentacionId alimentacionId, Tipo tipo, FranjaHoraria franjaHoraria) {
        this.hotelId = hotelId;
        this.alimentacionId = alimentacionId;
        this.tipo = tipo;
        this.franjaHoraria = franjaHoraria;
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

    public FranjaHoraria getFranjaHoraria() {
        return franjaHoraria;
    }
}
