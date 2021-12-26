package co.com.sofka.domain.Transporte.commands;

import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Transporte.value.Edad;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.Command;

public class AgregarGuia extends Command {
    private final TransporteId transporteId;
    private final GuiaId guiaId;
    private final Nombre nombre;
    private final Edad edad;
    private final Celular celular;

    public AgregarGuia(TransporteId transporteId, GuiaId guiaId, Nombre nombre, Edad edad, Celular celular) {
        this.transporteId = transporteId;
        this.guiaId = guiaId;
        this.nombre = nombre;
        this.edad = edad;
        this.celular = celular;
    }

    public TransporteId getTransporteId() {
        return transporteId;
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
