package co.com.sofka.domain.Transporte.event;

import co.com.sofka.General.Value.Modelo;
import co.com.sofka.domain.Transporte.value.CarroId;
import co.com.sofka.domain.generic.DomainEvent;

public class ModeloCarroModificado extends DomainEvent {
    private final CarroId carroId;
    private final Modelo modelo;

    public ModeloCarroModificado(CarroId carroId, Modelo modelo) {
        super("sofka.Transporte.ModeloCarroModificado");
        this.carroId = carroId;
        this.modelo = modelo;
    }

    public CarroId getCarroId() {
        return carroId;
    }

    public Modelo getModelo() {
        return modelo;
    }

}
