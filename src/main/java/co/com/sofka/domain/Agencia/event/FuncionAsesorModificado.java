package co.com.sofka.domain.Agencia.event;

import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.Agencia.value.Funcion;
import co.com.sofka.domain.generic.DomainEvent;

public class FuncionAsesorModificado extends DomainEvent {
    private final AsesorId asesorId;
    private final Funcion funcion;

    public FuncionAsesorModificado(AsesorId asesorId, Funcion funcion) {
        super("sofka.Agencia.FuncionAsesorModificado");
        this.asesorId = asesorId;
        this.funcion = funcion;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
