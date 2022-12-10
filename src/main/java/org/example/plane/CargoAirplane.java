package org.example.plane;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class CargoAirplane extends Airplane {

    private Boolean presenceOfLoader;
    private ParcelMaxParameters parcelMaxParameters;

    @Data
    public static class ParcelMaxParameters {
        private Integer maxHeight;
        private Integer maxWidth;
        private Integer maxLength;
        private Integer maxWeight;
    }

    @Override
    public String toString() {
        return "CargoAirplane{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", flightRange=" + super.getFlightRange() +
                ", fuelCapacity=" + super.getFuelCapacity() +
                ", loadCapacity=" + super.getLoadCapacity() +
                ", totalCapacity=" + super.getCapacity() +
                ", presenceOfLoader='" + presenceOfLoader + '\'' +
                ", parcel='" + parcelMaxParameters.toString() + '\'' +
                '}';
    }
}
