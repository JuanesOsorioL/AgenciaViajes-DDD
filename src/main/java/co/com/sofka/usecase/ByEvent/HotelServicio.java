package co.com.sofka.usecase.ByEvent;

import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Destino;

public interface HotelServicio {
    boolean send(AgenciaId agenciaId,String destino);
}
