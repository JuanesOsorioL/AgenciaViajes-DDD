package co.com.sofka.domain.Agencia;

import co.com.sofka.domain.Agencia.event.AgenciaCreado;
import co.com.sofka.domain.Transporte.event.TransporteCreado;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class AgenciateChange extends EventChange {
    public AgenciateChange(Agencia agencia) {
        apply((AgenciaCreado event) -> {
            agencia.agenciaId = event.getAgenciaId();
            agencia.nombre = event.getNombre();
            agencia.descripcion=event.getDescripcion();
            agencia.descripcion=event.getDescripcion();
            agencia.servicio = new HashSet<>();
        });


    }
}
