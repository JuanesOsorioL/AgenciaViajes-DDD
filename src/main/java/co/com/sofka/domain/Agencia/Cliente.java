package co.com.sofka.domain.Agencia;

import co.com.sofka.General.Value.*;
import co.com.sofka.domain.Agencia.value.Clave;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.Agencia.value.Nikname;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente extends Entity<ClienteId> {

    private Nombre nombre;
    private Celular celular;
    private Correo correo;
    private Nikname nikname;
    private Clave clave;

    public Cliente(ClienteId clienteId ,Nombre nombre, Celular celular,Correo correo,Nikname nikname,Clave clave) {
        super(clienteId);
        this.nombre= Objects.requireNonNull(nombre);
        this.celular= Objects.requireNonNull(celular);
        this.correo= Objects.requireNonNull(correo);
        this.nikname= Objects.requireNonNull(nikname);
        this.clave= Objects.requireNonNull(clave);
    }

    public void modificarNikname(Nikname nikname){
        this.nikname = Objects.requireNonNull(nikname);
    }

    public void modificarClave(Clave clave){
        this.clave = Objects.requireNonNull(clave);
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

    public Nikname nikname() {
        return nikname;
    }

    public Clave clave() {
        return clave;
    }
}
