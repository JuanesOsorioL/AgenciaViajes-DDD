package co.com.sofka.domain.Agencia.Entity;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.General.Value.Correo;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.AsesorId;
import co.com.sofka.domain.Agencia.value.Funcion;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Asesor extends Entity<AsesorId> {

    private Nombre nombre;
    private Celular celular;
    private Correo correo;
    private Funcion funcion;

    public Asesor(AsesorId asesorId ,Nombre nombre, Celular celular,Correo correo,Funcion funcion) {
        super(asesorId);
        this.nombre= Objects.requireNonNull(nombre);
        this.celular= Objects.requireNonNull(celular);
        this.correo= Objects.requireNonNull(correo);
        this.funcion= Objects.requireNonNull(funcion);
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarFuncion(Funcion funcion){
        this.funcion = Objects.requireNonNull(funcion);
    }

    public void modificarCelular(Celular celular){
        this.celular = Objects.requireNonNull(celular);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Celular celular() {
        return celular;
    }

    public Correo correo() {
        return correo;
    }

    public Funcion funcion() {
        return funcion;
    }
}
