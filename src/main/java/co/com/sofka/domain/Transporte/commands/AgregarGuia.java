package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.Edad;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.generic.Command;

public class AgregarGuia extends Command {
    private GuiaId guiaId;
    private Nombre nombre;
    private Edad edad;
    private Celular celular;

    public AgregarGuia(GuiaId guiaId, Nombre nombre, Edad edad, Celular celular) {
        this.guiaId = guiaId;
        this.nombre = nombre;
        this.edad = edad;
        this.celular = celular;
    }

    public GuiaId getGuiaId() {
        return guiaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Edad getEdad() {
        return edad;
    }

    public Celular getCelular() {
        return celular;
    }
}
