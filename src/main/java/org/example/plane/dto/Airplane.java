package org.example.plane.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import static com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @Type(value = PassengerAirplane.class, name = "Passenger airplane"),
        @Type(value = CargoAirplane.class, name = "Cargo airplane"),
        @Type(value = CorporateAirplane.class, name = "Corporative airplane"),
        @Type(value = LightCargoAirplane.class, name = "Light cargo airplane")
})
public abstract class Airplane {
    private String id;
    private String name;
    private String model;
    private Integer flightRange;
    private Integer fuelCapacity;
    private Integer loadCapacity;
    private Integer capacity;
}
