package org.example.plane;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.exception.ForbiddenOperationException;
import org.example.exception.ParametersOperationException;
import org.example.plane.dto.Airplane;
import org.example.plane.dto.LightCargoAirplane;
import org.example.plane.dto.PassengerAirplane;
import org.example.utils.DeserializationData;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Getter
@NoArgsConstructor
public class AirplanesList {

    List<? extends Airplane> airplaneList;

    public void fillListWithContent() throws IOException {
        airplaneList = DeserializationData.readFile();
    }

    public long calculateTotalCapacity() {
        return airplaneList.stream()
                .filter(airplane -> checkNullAndNegativeValueInObject(airplane.getCapacity(), "capacity"))
                .mapToLong(Airplane::getCapacity)
                .sum();
    }

    public long calculateTotalLoadCapacity() {
        return airplaneList.stream()
                .filter(airplane -> checkNullAndNegativeValueInObject(airplane.getLoadCapacity(), "loadCapacity"))
                .mapToLong(Airplane::getLoadCapacity)
                .sum();
    }

    public List<Airplane> sortAirplanesByFlightDistanceDesc() {
        return airplaneList.stream()
                .filter(airplane -> checkNullAndNegativeValueInObject(airplane.getFlightRange(), "flightRange"))
                .sorted(Comparator.comparing(Airplane::getFlightRange).reversed())
                .collect(Collectors.toList());
    }

    public List<Airplane> searchAirplanesByFlightDistance(int fParam, int sParam) {

        if (isNegative(fParam) || isNegative(sParam)) {
            throw new ParametersOperationException("Parameters can't have negative value");
        }
        if (fParam > sParam) {
            throw new ParametersOperationException("Forbidden operation because first parameter can't be greater that second parameter");
        }
        return airplaneList.stream()
                .filter(airplane -> checkNullAndNegativeValueInObject(airplane.getFlightRange(), "flightRange"))
                .filter(a -> a.getFlightRange() >= fParam && a.getFlightRange() < sParam)
                .collect(Collectors.toList());
    }

    public List<LightCargoAirplane> searchLightCargoAirplanes() {
        return airplaneList.stream()
                .filter(LightCargoAirplane.class::isInstance)
                .map(LightCargoAirplane.class::cast)
                .collect(Collectors.toList());
    }

    public List<PassengerAirplane> searchPassengerAirplaneWithParameterForFeature(String parameter) {
        return airplaneList.stream()
                .filter(PassengerAirplane.class::isInstance)
                .map(PassengerAirplane.class::cast)
                .filter(passengerAirplane -> passengerAirplane.getFeaturesForPassengers().contains(parameter))
                .collect(Collectors.toList());
    }

    private static boolean checkNullAndNegativeValueInObject(Integer field, String fieldName) {
        if (isNull(field))
            throw new ForbiddenOperationException(String.format("Forbidden Operation: Object have null in '%s' field", fieldName));
        else if (isNegative(field))
            throw new ForbiddenOperationException(String.format("Forbidden Operation: Object have negative value for '%s' field", fieldName));
        return true;
    }

    private static boolean isNegative(Integer value) {
        return value < 0;
    }

    @Override
    public String toString() {
        return "AirplanesList" + '\n' +
                airplaneList +
                ']';
    }
}