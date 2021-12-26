package co.com.sofka.domain.Transporte.event;


import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Transporte.value.Edad;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.generic.DomainEvent;

public class GuiaAgregado extends DomainEvent {
    private final GuiaId guiaId;
    private final Nombre nombre;
    private final Edad edad;
    private final Celular celular;

    public GuiaAgregado(GuiaId guiaId, Nombre nombre, Edad edad, Celular celular) {
        super("sofka.Transporte.GuiaAgregado");
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
