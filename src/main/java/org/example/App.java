package org.example;

import org.example.plane.AirplanesList;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        AirplanesList airplanesList = new AirplanesList();
        airplanesList.fillListWithContent();

        System.out.println("1. List of airplanes: \n" + airplanesList);
        System.out.println("2. Total capacity: " + airplanesList.calculateTotalCapacity());
        System.out.println("3. Total load capacity: " + airplanesList.calculateTotalLoadCapacity());
        System.out.println("4. After sorting by flight distance:\n" + airplanesList.sortAirplanesByFlightDistanceDesc());
        System.out.println("5. Search airplanes with criteria: \n" + airplanesList.searchAirplanesByFlightDistance(0, 5000));
    }
}
