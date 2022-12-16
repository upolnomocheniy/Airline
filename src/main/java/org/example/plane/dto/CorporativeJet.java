package org.example.plane.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CorporativeJet extends PassengerAirplane{
    @Override
    public String toString() {
        return "CorporativeAirplane{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", flightRange=" + super.getFlightRange() +
                ", fuelCapacity=" + super.getFuelCapacity() +
                ", loadCapacity=" + super.getLoadCapacity() +
                ", totalCapacity=" + super.getCapacity() +
                ", featuresForPassengers='" + super.getFeaturesForPassengers() + '\'' +
                '}' + '\n';
    }
}
