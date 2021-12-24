package co.com.sofka.domain.Agencia;

import co.com.sofka.General.Value.Capacidad;
import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.Entity.Asesor;
import co.com.sofka.domain.Agencia.Entity.Cliente;
import co.com.sofka.domain.Agencia.Entity.ServicioAgencia;
import co.com.sofka.domain.Agencia.event.AgenciaCreado;
import co.com.sofka.domain.Agencia.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Agencia extends AggregateEvent<AgenciaId> {

    protected AgenciaId agenciaId;
    protected Nombre nombre;
    //protected HotelId hotelId;
    protected Cliente cliente;
    protected OVTransporte transporte;
    protected OVHotel hotel;
    protected Set<ServicioAgencia> servicio;
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

    public void asociarHotel(Capacidad capacidad){
        //this.capacidad = Objects.requireNonNull(capacidad);
    }


}
