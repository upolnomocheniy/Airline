package org.example.plane;

import lombok.Getter;
import org.example.exception.ForbiddenOperationException;
import org.example.plane.dto.Airplane;
import org.example.utils.DeserializationData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class AirplanesList {

    List<Airplane> airplaneList;

    public AirplanesList() {
        airplaneList = new ArrayList<>();
    }

    public void fillListWithContent() throws IOException {
        airplaneList = DeserializationData.readFile();
    }

    public void showObj(List<Airplane> airplanes) {
        System.out.println("Kvitka airlines");
        airplanes.forEach(System.out::println);
    }

    public long calculateTotalCapacity() {
        return airplaneList.stream()
                .mapToLong(Airplane::getCapacity)
                .sum();
    }

    public long calculateTotalLoadCapacity() {
        return airplaneList.stream()
                .filter(airplane -> airplane.getLoadCapacity() != null)
                .mapToLong(Airplane::getLoadCapacity)
                .sum();
    }

    public List<Airplane> sortAirplanesByFlightDistanceAsc() {
        return airplaneList.stream()
                .filter(airplane -> airplane.getFlightRange() != null)
                .sorted(Comparator.comparing(Airplane::getFlightRange))
                .collect(Collectors.toList());
    }

    public List<Airplane> sortAirplanesByFlightDistanceDesc() {
        return airplaneList.stream()
                .filter(airplane -> airplane.getFlightRange() != null)
                .sorted(Comparator.comparing(Airplane::getFlightRange).reversed())
                .collect(Collectors.toList());
    }

    public List<Airplane> searchAirplaneByFlightDistance(int fParam, int sParam) {

        if (fParam > sParam) {
            throw new ForbiddenOperationException("Forbidden operation because first parameter can't be greater that second parameter");
        }

        return airplaneList.stream()
                .filter(airplane -> {
                    if (airplane.getFlightRange() == null) {
                        throw new IllegalArgumentException("Check please flight range data for diapasone of sort");
                    }
                    return true;
                })
                .filter(a -> a.getFlightRange() >= fParam && a.getFlightRange() < sParam)
                .collect(Collectors.toList());
    }
}


