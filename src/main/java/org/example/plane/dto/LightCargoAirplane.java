package org.example.plane.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LightCargoAirplane extends CargoAirplane{
    @Override
    public String toString() {
        return "LightCargoAirplane{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", flightRange=" + super.getFlightRange() +
                ", fuelCapacity=" + super.getFuelCapacity() +
                ", loadCapacity=" + super.getLoadCapacity() +
                ", totalCapacity=" + super.getCapacity() +
                ", presenceOfLoader='" + super.getPresenceOfLoader() + '\'' +
                ", parcel='" + super.getParcelMaxParameters().toString() + '\'' +
                '}' + "\n";
    }
}
