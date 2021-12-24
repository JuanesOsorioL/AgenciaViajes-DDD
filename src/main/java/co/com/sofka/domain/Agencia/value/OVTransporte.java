package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.Transporte.Entity.Avion;
import co.com.sofka.domain.Transporte.Entity.Carro;
import co.com.sofka.domain.Transporte.Entity.Guia;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Set;

public class OVTransporte implements ValueObject<OVTransporte.Properties> {
    private String TransporteID;
    private String nombreTransporte;
    protected Set<Guia>guia;
    protected Set<Avion>avion;
    protected Set<Carro>carro;

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String TransporteID() {
                return TransporteID;
            }

            @Override
            public String nombreTransporte() {
                return nombreTransporte;
            }

            @Override
            public Set<Guia> guia() {
                return guia;
            }

            @Override
            public Set<Avion> avion() {
                return avion;
            }

            @Override
            public Set<Carro> carro() {
                return carro;
            }
        };
    }

   /* public OVTransporte(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion,"La Descripcion es requerida");
    }*/

    public interface Properties{
        String TransporteID();
        String nombreTransporte();
        Set<Guia>guia();
        Set<Avion>avion();
        Set<Carro>carro();

    }
}
