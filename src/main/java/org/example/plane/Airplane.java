package org.example.plane;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Data
@NoArgsConstructor
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @Type(value = PassengerAirplane.class, name = "Passenger airplane"),
        @Type(value = CargoAirplane.class, name = "Cargo airplane")
}
)
public abstract class Airplane {

    private String id;
    private String name;
    private String model;
    private Integer flightRange;
    private Integer fuelCapacity;
    private Integer loadCapacity;
    private Integer totalCapacity;

    public Airplane(
            String id,
            String name,
            String model,
            Integer flightRange,
            Integer fuelCapacity,
            Integer loadCapacity,
            Integer totalCapacity
            ) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.flightRange = flightRange;
        this.fuelCapacity = fuelCapacity;
        this.loadCapacity = loadCapacity;
        this.totalCapacity = totalCapacity;
    }
}
