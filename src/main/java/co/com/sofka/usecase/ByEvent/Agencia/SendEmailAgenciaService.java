package co.com.sofka.usecase.ByEvent.Agencia;

import co.com.sofka.domain.Agencia.value.AgenciaId;

public interface SendEmailAgenciaService {
    boolean send(AgenciaId agenciaId, String email, String body);
}
