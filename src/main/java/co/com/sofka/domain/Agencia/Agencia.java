package co.com.sofka.domain.Agencia;

import co.com.sofka.General.Value.Nombre;
import co.com.sofka.domain.Agencia.value.AgenciaId;
import co.com.sofka.domain.Agencia.value.Descripcion;
import co.com.sofka.domain.Agencia.value.Destino;
import co.com.sofka.domain.Transporte.value.TransporteId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Agencia extends AggregateEvent<AgenciaId> {

    protected AgenciaId agenciaId;
    protected Nombre nombre;
    protected HotelId hotelId;
    protected Cliente cliente;
    protected TransporteId transporteId;
    protected Set<Servicio> servicio;
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


}
