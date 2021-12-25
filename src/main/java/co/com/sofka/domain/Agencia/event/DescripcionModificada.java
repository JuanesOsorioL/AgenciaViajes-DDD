package co.com.sofka.domain.Agencia.event;

import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.General.Value.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionModificada extends DomainEvent {
    private final AgenciaId agenciaId;
    private final Descripcion descripcion;

    public DescripcionModificada(AgenciaId agenciaId, Descripcion descripcion) {
        super("sofka.Agencia.DescripcionModificada");
        this.agenciaId = agenciaId;
        this.descripcion = descripcion;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
