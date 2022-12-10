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
    private ParcelSizeMax parcelSize;

    @Data
    public static class ParcelSizeMax {
        private Integer maxHeight;
        private Integer maxWidth;
        private Integer maxLength;
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
                ", totalCapacity=" + super.getTotalCapacity() +
                ", presenceOfLoader='" + presenceOfLoader + '\'' +
                ", parcel='" + parcelSize.toString() + '\'' +
                '}';
    }
}
