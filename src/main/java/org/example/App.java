package org.example;

import org.example.plane.AirplanesList;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        AirplanesList airplanesList = new AirplanesList();

        airplanesList.fillListWithContent();
        airplanesList.showObj(airplanesList.getAirplaneList());

        System.out.println("Total capacity: " + airplanesList.calculateTotalCapacity());
        System.out.println("Total load capacity: " + airplanesList.calculateTotalLoadCapacity());

        airplanesList.showObj(airplanesList.sortAirplanesByFlightDistanceDesc());

        airplanesList.showObj(airplanesList.searchAirplaneByFlightDistance(10, 5000));
    }
}
