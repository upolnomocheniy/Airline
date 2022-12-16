package com.epam.yevhen_kvitka;

import com.epam.yevhen_kvitka.plane.AirplanesList;

public class App {
    public static void main(String[] args) {

        AirplanesList airplanesList = new AirplanesList();
        airplanesList.fillListWithContent();

        System.out.println("1. List of airplanes: \n" + airplanesList);
        System.out.println("2. Total capacity: " + airplanesList.calculateTotalCapacity());
        System.out.println("3. Total load capacity: " + airplanesList.calculateTotalLoadCapacity());
        System.out.println("4. After sorting by flight distance:\n" + airplanesList.sortAirplanesByFlightDistanceDesc());
        System.out.println("5. Search airplanes with criteria: \n" + airplanesList.searchAirplanesByFlightDistance(0, 5000));
        System.out.println("6. Search light cargo jets from the all list: \n" + airplanesList.searchLightCargoAirplanes());
        System.out.println("7. Search passenger jets(include light jets version): \n" + airplanesList.searchPassengerAirplaneWithParameterForFeature("Eats"));

    }
}
