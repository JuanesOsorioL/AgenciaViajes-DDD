package co.com.sofka.domain.Hotel.value;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class FranjaHoraria implements ValueObject<FranjaHoraria.Valor> {

        private final Valor value;

        public FranjaHoraria(Valor valor) {
            this.value = valor;
        }

        public enum Valor {
            MAÑANA,
            TARDE,
            NOCHE
        }

        @Override
        public Valor value() {
            return value;
        }
}
