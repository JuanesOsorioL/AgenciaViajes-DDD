package co.com.sofka.domain.Agencia.event;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.General.Value.Correo;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.Agencia.value.Funcion;
import co.com.sofka.domain.generic.DomainEvent;

public class AsesorCreado extends DomainEvent {
    private final AsesorId asesorId;
    private final Nombre nombre;
    private final Celular celular;
    private final Correo correo;
    private final Funcion funcion;

    public AsesorCreado(AsesorId asesorId, Nombre nombre, Celular celular, Correo correo, Funcion funcion) {
        super("sofka.Agencia.AsesorCreado");
        this.asesorId = asesorId;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
        this.funcion = funcion;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }

    public Correo getCorreo() {
        return correo;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
