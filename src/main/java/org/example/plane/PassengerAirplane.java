package org.example.plane;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PassengerAirplane extends Airplane {

    private Integer numberOfPassengers;
    private List<String> featuresForPassengers;

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", flightRange=" + super.getFlightRange() +
                ", fuelCapacity=" + super.getFuelCapacity() +
                ", loadCapacity=" + super.getLoadCapacity() +
                ", totalCapacity=" + super.getTotalCapacity() +
                ", numberOfPassengers='" + numberOfPassengers + '\'' +
                ", featuresForPassengers='" + featuresForPassengers + '\'' +
                '}';
    }
}
