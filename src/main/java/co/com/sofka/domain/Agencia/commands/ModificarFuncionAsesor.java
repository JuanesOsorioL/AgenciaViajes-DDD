package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.Agencia.value.Funcion;
import co.com.sofka.domain.generic.Command;

public class ModificarFuncionAsesor extends Command {
    private final AsesorId asesorId;
    private final Funcion funcion;

    public ModificarFuncionAsesor(AsesorId asesorId, Funcion funcion) {
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
