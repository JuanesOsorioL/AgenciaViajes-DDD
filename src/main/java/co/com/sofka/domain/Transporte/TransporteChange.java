package co.com.sofka.domain.Transporte;

import co.com.sofka.domain.Transporte.Entity.Avion;
import co.com.sofka.domain.Transporte.Entity.Carro;
import co.com.sofka.domain.Transporte.Entity.Guia;
import co.com.sofka.domain.Transporte.event.*;
import co.com.sofka.domain.generic.EventChange;
import java.util.HashSet;

public class TransporteChange extends EventChange {

    public TransporteChange(Transporte transporte) {

        apply((TransporteCreado event) -> {
            transporte.nombre = event.getNombre();
            transporte.guia = new HashSet<>();
            transporte.avion = new HashSet<>();
            transporte.carro = new HashSet<>();
        });

        apply((CarroAgregado event) -> {
            transporte.carro.add(new Carro(
                    event.getCarroId(),
                    event.getModelo(),
                    event.getCapacidad()));
        });

        apply((AvionAgregado event) -> {
            transporte.avion.add(new Avion(
                    event.getAvionId(),
                    event.getModelo(),
                    event.getCapacidad()));
        });

        apply((GuiaAgregado event) -> {
            transporte.guia.add(new Guia(
                    event.getGuiaId(),
                    event.getNombre(),
                    event.getEdad(),
                    event.getCelular()));
        });


        apply((NombreModificado event) -> {
            transporte.nombre=event.getNombre();
        });

        apply((NombreGuiaModificado event) -> {
            var guia = transporte.buscarGuiaPorId(event.getGuiaId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el Guia"));
            guia.modificarNombre(event.getNombre());
        });

       apply((CelularGuiaModificado event) -> {
            var guia = transporte.buscarGuiaPorId(event.getGuiaId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el Guia"));
            guia.modificarCelular(event.getCelular());
        });

        apply((ModeloAvionModificado event) -> {
            var avion = transporte.buscarAvionId(event.getAvionId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el Avion"));
            avion.modificarModelo(event.getModelo());
        });

        apply((CapacidadAvionModificado event) -> {
            var avion = transporte.buscarAvionId(event.getAvionId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el Avion"));
            avion.modificarCapacidad(event.getCapacidad());
        });

        apply((ModeloCarroModificado event) -> {
            var carro = transporte.buscarCarroId(event.getCarroId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el Carro"));
            carro.modificarModelo(event.getModelo());
        });

        apply((CapacidadCarroModificado event) -> {
            var carro = transporte.buscarCarroId(event.getCarroId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el Carro"));
            carro.modificarCapacidad(event.getCapacidad());
        });
    }
}
