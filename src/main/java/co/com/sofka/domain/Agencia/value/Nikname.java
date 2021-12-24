package co.com.sofka.domain.Agencia.value;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Nikname implements ValueObject<String> {

    private String nikname;

    public Nikname(String nikname) {
        this.nikname = Objects.requireNonNull(nikname,"El Nikname es requerida");
    }

    @Override
    public String value() {
        return nikname;
    }
}
