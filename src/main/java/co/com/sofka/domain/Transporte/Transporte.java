package co.com.sofka.domain.Transporte;

import co.com.sofka.domain.General.Capacidad;
import co.com.sofka.domain.General.Celular;
import co.com.sofka.domain.General.Modelo;
import co.com.sofka.domain.General.Nombre;
import co.com.sofka.domain.Transporte.Entity.*;
import co.com.sofka.domain.Transporte.event.*;
import co.com.sofka.domain.Transporte.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Transporte extends AggregateEvent<TransporteId> {

    protected Nombre nombre;
    protected Set<Guia> guia;
    protected Set<Avion> avion;
    protected Set<Carro> carro;

    public Transporte(TransporteId transporteId, Nombre nombre) {
        super(transporteId);
        appendChange(new TransporteCreado(transporteId,nombre)).apply();
    }

    public Transporte(TransporteId transporteId) {
        super(transporteId);
        subscribe(new TransporteChange(this));
    }

    public static Transporte from(TransporteId transporteId, List<DomainEvent> events){
        var transporte = new Transporte(transporteId);
        events.forEach(transporte::applyEvent);
        return transporte;
    }

    public void agregarAvion(AvionId avionId, Modelo modelo, Capacidad capacidad){
        Objects.requireNonNull(avionId);
        Objects.requireNonNull(modelo);
        Objects.requireNonNull(capacidad);
        appendChange(new AvionAgregado(avionId,modelo,capacidad)).apply();
    }

    public void agregarCarro(CarroId carroId, Modelo modelo, Capacidad capacidad){
        Objects.requireNonNull(carroId);
        Objects.requireNonNull(modelo);
        Objects.requireNonNull(capacidad);
        appendChange(new CarroAgregado(carroId,modelo,capacidad)).apply();
    }

    public void agregarGuia(GuiaId guiaId,Nombre nombre, Edad edad, Celular celular){
        Objects.requireNonNull(guiaId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(celular);
        appendChange(new GuiaAgregado(guiaId,nombre,edad,celular)).apply();
    }

    public void modificarNombre(TransporteId transporteId, Nombre nombre){
        Objects.requireNonNull(transporteId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreModificado(transporteId,nombre)).apply();
    }

    public void modificarNombreGuia(GuiaId guiaId, Nombre nombre){
        Objects.requireNonNull(guiaId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreGuiaModificado(guiaId,nombre)).apply();
    }

    public void modificarCelularGuia(GuiaId guiaId, Celular celular){
        Objects.requireNonNull(guiaId);
        Objects.requireNonNull(celular);
        appendChange(new CelularGuiaModificado(guiaId,celular)).apply();
    }

    public void modificarModeloAvion(AvionId avionId , Modelo modelo){
        Objects.requireNonNull(avionId);
        Objects.requireNonNull(modelo);
        appendChange(new ModeloAvionModificado(avionId,modelo)).apply();
    }

    public void modificarCapacidadAvion(AvionId avionId , Capacidad capacidad){
        Objects.requireNonNull(avionId);
        Objects.requireNonNull(capacidad);
        appendChange(new CapacidadAvionModificado(avionId,capacidad)).apply();
    }

    public void modificarModeloCarro(CarroId carroId  , Modelo modelo){
        Objects.requireNonNull(carroId);
        Objects.requireNonNull(modelo);
        appendChange(new ModeloCarroModificado(carroId,modelo)).apply();
    }

    public void modificarCapacidadCarro(CarroId carroId , Capacidad capacidad){
        Objects.requireNonNull(carroId);
        Objects.requireNonNull(capacidad);
        appendChange(new CapacidadCarroModificado(carroId,capacidad)).apply();
    }

    public Optional<Guia> buscarGuiaPorId(GuiaId guiaId){
        return guia.stream()
                .filter(guia->guia.identity().equals(guiaId)).findFirst();
    }

    public Optional<Carro> buscarCarroId(CarroId carroId){
        return carro.stream()
                .filter(carro->carro.identity().equals(carroId)).findFirst();
    }

    public Optional<Avion> buscarAvionId(AvionId avionId){
        return avion.stream()
                .filter(avion->avion.identity().equals(avionId)).findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Set<Guia> guia() {
        return guia;
    }

    public Set<Avion> avion() {
        return avion;
    }

    public Set<Carro> carro() {
        return carro;
    }
}
