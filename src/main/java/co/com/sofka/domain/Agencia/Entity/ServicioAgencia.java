package co.com.sofka.domain.Agencia.Entity;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class ServicioAgencia extends Entity<ServicioId> {

    private Nombre nombre;
    private Descripcion descripcion;

    public ServicioAgencia(ServicioId servicioId , Nombre nombre, Descripcion descripcion) {
        super(servicioId);
        this.nombre= Objects.requireNonNull(nombre);
        this.descripcion= Objects.requireNonNull(descripcion);
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

}