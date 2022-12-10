package org.example.plane;

import lombok.Getter;
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

    public void showObj(List<Airplane> test) {
        System.out.println("Kvitka airlines");
        test.forEach(
                System.out::println
        );
    }

    public long calculateTotalCapacity() {
        return airplaneList.stream()
                .mapToLong(Airplane::getCapacity)
                .sum();
    }

    public long calculateTotalLoadCapacity() {
        return airplaneList.stream()
                .mapToLong(Airplane::getLoadCapacity)
                .sum();
    }

    public List<Airplane> sortAirplanesByFlightDistanceAsc() {
        return airplaneList
                .stream()
                .sorted(Comparator.comparing(Airplane::getFlightRange))
                .collect(Collectors.toList());
    }

    public List<Airplane> sortAirplanesByFlightDistanceDesc() {
        return airplaneList
                .stream()
                .sorted(Comparator.comparing(Airplane::getFlightRange).reversed())
                .collect(Collectors.toList());
    }

    public List<Airplane> searchAirplaneByFlightDistance(int fParam, int sParam) {

        if (fParam > sParam) {
            throw new IllegalArgumentException("First parameter can't be greater that second parameter");
        }

        return airplaneList.stream()
                .filter(a -> a.getFlightRange() >= fParam && a.getFlightRange() < sParam)
                .collect(Collectors.toList());
    }
}