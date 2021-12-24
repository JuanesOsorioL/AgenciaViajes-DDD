package co.com.sofka.domain.Agencia.commands;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.Descripcion;
import co.com.sofka.domain.Agencia.value.ServicioAgenciaId;
import co.com.sofka.domain.generic.Command;

public class AgregarServicioAgencia extends Command {
    private final ServicioAgenciaId id;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public AgregarServicioAgencia(ServicioAgenciaId id, Nombre nombre, Descripcion descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public ServicioAgenciaId getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
