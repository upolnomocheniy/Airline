package org.example.plane;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class PassengerAirplane extends Airplane {

    private Integer numberOfPassengers;
    private List<String> featuresForPassengers;

    public PassengerAirplane(Integer numberOfPassengers, List<String> featuresForPassengers) {
        this.numberOfPassengers = numberOfPassengers;
        this.featuresForPassengers = featuresForPassengers;
    }

    public PassengerAirplane(String id,
                             String name,
                             String model,
                             Integer flightRange,
                             Integer fuelCapacity,
                             Integer loadCapacity,
                             Integer totalCapacity,
                             Integer numberOfPassengers,
                             List<String> featuresForPassengers) {
        super(id, name, model, flightRange, fuelCapacity, loadCapacity, totalCapacity);
        this.numberOfPassengers = numberOfPassengers;
        this.featuresForPassengers = featuresForPassengers;
    }

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
