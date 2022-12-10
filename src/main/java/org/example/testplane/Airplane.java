package org.example.testplane;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @Type(value = PassengerAirplane.class, name = "Passenger airplane"),
        @Type(value = CargoAirplane.class, name = "Cargo airplane")
}
)
@NoArgsConstructor
public abstract class Airplane {

    private String test;

    public Airplane(String test) {
        this.test = test;
    }
}
