package co.com.sofka.domain.Agencia;


import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.General.Correo;
import co.com.sofka.domain.General.Descripcion;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Agencia.Entity.Asesor;
import co.com.sofka.domain.Agencia.Entity.Cliente;
import co.com.sofka.domain.Agencia.Entity.ServicioAgencia;
import co.com.sofka.domain.Agencia.event.*;
import co.com.sofka.domain.Agencia.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Agencia extends AggregateEvent<AgenciaId> {

    protected AgenciaId agenciaId;
    protected Nombre nombre;
    protected OVHotel hotel;
    protected OVTransporte transporte;
    protected Cliente cliente;
    protected Set<ServicioAgencia> servicioAgencias;
    protected Asesor asesor;
    protected Descripcion descripcion;
    protected Destino destino;

    public Agencia(AgenciaId agenciaId, Nombre nombre,Descripcion descripcion,Destino destino) {
        super(agenciaId);
        appendChange(new AgenciaCreado(agenciaId,nombre,descripcion,destino)).apply();
    }

    public Agencia(AgenciaId agenciaId) {
        super(agenciaId);
        subscribe(new AgenciateChange(this));
    }

    public static Agencia from(AgenciaId agenciaId, List<DomainEvent> events){
        var agencia = new Agencia(agenciaId);
        events.forEach(agencia::applyEvent);
        return agencia;
    }

    public void agregarServicioAgencia(ServicioAgenciaId servicioAgenciaId, Nombre nombre, Descripcion descripcion){
        Objects.requireNonNull(servicioAgenciaId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        appendChange(new ServicioAgenciaAgregado(servicioAgenciaId,nombre,descripcion)).apply();
    }

    public void modificarDescripcion(AgenciaId agenciaId,Descripcion descripcion){
        Objects.requireNonNull(agenciaId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionModificada(agenciaId,descripcion)).apply();
    }

    public void modificarDestino(AgenciaId agenciaId,Destino destino){
        Objects.requireNonNull(agenciaId);
        Objects.requireNonNull(destino);
        appendChange(new DestinoModificado(agenciaId,destino)).apply();
    }

    public void crearAsesor(AsesorId asesorId, Nombre nombre, Celular celular, Correo correo, Funcion funcion){
        Objects.requireNonNull(asesorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(celular);
        Objects.requireNonNull(correo);
        Objects.requireNonNull(funcion);
        appendChange(new AsesorCreado(asesorId,nombre,celular,correo,funcion)).apply();
    }

    public void crearCliente(ClienteId clienteId,Nombre nombre, Celular celular, Correo correo, NumeroPersonas NumeroPersonas){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(celular);
        Objects.requireNonNull(correo);
        Objects.requireNonNull(NumeroPersonas);
        appendChange(new ClienteCreado(clienteId,nombre,celular,correo,NumeroPersonas)).apply();
    }

    public void modificarNombreAsesor(AsesorId asesorId ,Nombre nombre){
        Objects.requireNonNull(asesorId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreAsesorModificado(asesorId,nombre)).apply();
    }

    public void modificarFuncionAsesor(AsesorId asesorId ,Funcion funcion){
        Objects.requireNonNull(asesorId);
        Objects.requireNonNull(funcion);
        appendChange(new FuncionAsesorModificado(asesorId,funcion)).apply();
    }

    public void modificarCelularAsesor(AsesorId asesorId , Celular celular){
        Objects.requireNonNull(asesorId);
        Objects.requireNonNull(celular);
        appendChange(new CelularAsesorModificado(asesorId,celular)).apply();
    }

    public Optional<ServicioAgencia> buscarServicioAgenciaId(ServicioAgenciaId servicioAgenciaId){
        return servicioAgencias.stream()
                .filter(servicio->servicio.identity().equals(servicioAgenciaId)).findFirst();
    }

    public void modificarNombreServicioAgencia(ServicioAgenciaId servicioAgenciaId , Nombre nombre){
        Objects.requireNonNull(servicioAgenciaId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreServicioAgenciaModificado(servicioAgenciaId,nombre)).apply();
    }

    public void modificarDescripcionServicioAgencia(ServicioAgenciaId servicioAgenciaId,Descripcion descripcion){
        Objects.requireNonNull(servicioAgenciaId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionServicioAgenciaModificado(servicioAgenciaId,descripcion)).apply();
    }

    public void modificarCelularCliente(ClienteId clienteId ,Celular celular){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(celular);
        appendChange(new CelularClienteModificado(clienteId,celular)).apply();
    }

    public void modificarCorreoCliente(ClienteId clienteId , Correo correo){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(correo);
        appendChange(new CorreoClienteModificado(clienteId,correo)).apply();
    }

    public void modificarNumeroPersonasCliente(ClienteId clienteId ,NumeroPersonas numeroPersonas){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(numeroPersonas);
        appendChange(new NumeroPersonasClienteModificado(clienteId,numeroPersonas)).apply();
    }
}
