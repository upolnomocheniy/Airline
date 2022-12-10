package org.example.plane;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @Type(value = PassengerAirplane.class, name = "Passenger airplane"),
        @Type(value = CargoAirplane.class, name = "Cargo airplane")
})
public abstract class Airplane {
    private String id;
    private String name;
    private String model;
    private Integer flightRange;
    private Integer fuelCapacity;
    private Integer loadCapacity;
    private Integer totalCapacity;
}
