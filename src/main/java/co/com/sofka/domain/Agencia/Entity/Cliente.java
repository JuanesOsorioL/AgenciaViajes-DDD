package co.com.sofka.domain.Agencia.Entity;

import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.General.Correo;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.Agencia.value.NumeroPersonas;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente extends Entity<ClienteId> {

    private Nombre nombre;
    private Celular celular;
    private Correo correo;
    private NumeroPersonas NumeroPersonas;


    public Cliente(ClienteId clienteId , Nombre nombre, Celular celular, Correo correo, NumeroPersonas NumeroPersonas) {
        super(clienteId);
        this.nombre= Objects.requireNonNull(nombre);
        this.celular= Objects.requireNonNull(celular);
        this.correo= Objects.requireNonNull(correo);
        this.NumeroPersonas= Objects.requireNonNull(NumeroPersonas);
    }

    public void modificarCorreo(Correo correo){
        this.correo = Objects.requireNonNull(correo);
    }

    public void modificarClave(NumeroPersonas NumeroPersonas){
        this.NumeroPersonas = Objects.requireNonNull(NumeroPersonas);
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

    public NumeroPersonas numeroPersonas() {
        return NumeroPersonas;
    }
}
