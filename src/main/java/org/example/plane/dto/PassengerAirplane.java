package org.example.plane.dto;

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
                ", totalCapacity=" + super.getCapacity() +
                ", featuresForPassengers='" + featuresForPassengers + '\'' +
                '}' + '\n';
    }
}
