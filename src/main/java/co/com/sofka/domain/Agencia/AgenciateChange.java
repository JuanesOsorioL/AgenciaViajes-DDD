package co.com.sofka.domain.Agencia;

import co.com.sofka.domain.Agencia.Entity.Asesor;
import co.com.sofka.domain.Agencia.Entity.ServicioAgencia;
import co.com.sofka.domain.Agencia.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class AgenciateChange extends EventChange {
    public AgenciateChange(Agencia agencia) {

        apply((AgenciaCreado event) -> {
            agencia.agenciaId = event.getAgenciaId();
            agencia.nombre = event.getNombre();
            agencia.descripcion=event.getDescripcion();
            agencia.destino=event.getDestino();
            agencia.servicioAgencias = new HashSet<>();
        });

        apply((ServicioAgenciaAgregado event) -> {
            agencia.servicioAgencias.add(new ServicioAgencia(
                    event.getAgenciaId(),
                    event.getNombre(),
                    event.getDescripcion()));
        });

        apply((DescripcionModificada event) -> {
            agencia.descripcion=event.getDescripcion();
        });

        apply((DestinoModificado event) -> {
            agencia.destino=event.getDestino();
        });

        apply((AsesorCreado event)->{
            agencia.asesor = new Asesor(
                    event.getAsesorId(),
                    event.getNombre(),
                    event.getCelular(),
                    event.getCorreo(),
                    event.getFuncion()
            );
        });

        apply((NombreAsesorModificado event) -> {
            agencia.asesor.modificarNombre(event.getNombre());
        });

        apply((FuncionAsesorModificado event) -> {
            agencia.asesor.modificarFuncion(event.getFuncion());
        });

        apply((CelularAsesorModificado event) -> {
            agencia.asesor.modificarCelular(event.getCelular());
        });


        apply((NombreServicioAgenciaModificado event) -> {
            var servicio = agencia.buscarServicioAgenciaId(event.getServicioAgenciaId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el Servicio"));
            servicio.modificarNombre(event.getNombre());
        });

        apply((DescripcionServicioAgenciaModificado event) -> {
            var servicio = agencia.buscarServicioAgenciaId(event.getServicioAgenciaId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el Servicio"));
            servicio.modificarDescripcion(event.getDescripcion());
        });

        apply((CelularClienteModificado event) -> {
            agencia.cliente.modificarCelular(event.getCelular());
        });

        apply((CorreoClienteModificado event) -> {
            agencia.cliente.modificarCorreo(event.getCorreo());
        });
    }
}
