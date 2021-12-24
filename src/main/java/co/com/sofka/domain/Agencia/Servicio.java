package co.com.sofka.domain.Agencia;

import co.com.sofka.General.Value.Celular;
import co.com.sofka.General.Value.Correo;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.Clave;
import co.com.sofka.domain.Agencia.value.ClienteId;
import co.com.sofka.domain.Agencia.value.Nikname;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Servicio extends Entity<ClienteId> {

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
}
