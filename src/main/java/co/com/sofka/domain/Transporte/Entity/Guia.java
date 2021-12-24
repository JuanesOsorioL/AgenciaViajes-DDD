package co.com.sofka.domain.Transporte.Entity;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Transporte.value.Edad;
import co.com.sofka.domain.Transporte.value.GuiaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Guia extends Entity<GuiaId> {

    private Nombre nombre;
    private Edad edad;
    private Celular celular;


    public Guia(GuiaId guiaId ,Nombre nombre, Edad edad,Celular celular) {
        super(guiaId);
        this.nombre= Objects.requireNonNull(nombre);
        this.celular= Objects.requireNonNull(celular);
        this.edad= Objects.requireNonNull(edad);
    }


    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarCelular(Celular celular){
        this.celular = Objects.requireNonNull(celular);
    }


    public Nombre nombre() {
        return nombre;
    }

    public Edad edad() {
        return edad;
    }

    public Celular celular() {
        return celular;
    }
}
