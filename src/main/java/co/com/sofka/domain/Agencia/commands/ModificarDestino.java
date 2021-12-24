package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Destino;
import co.com.sofka.domain.generic.Command;

public class ModificarDestino extends Command {
    private final AgenciaId agenciaId;
    private final Destino destino;

    public ModificarDestino(AgenciaId agenciaId, Destino destino) {
        this.agenciaId = agenciaId;
        this.destino = destino;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public Destino getDestino() {
        return destino;
    }
}
