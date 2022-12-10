package org.example;

import org.example.plane.Airplane;
import org.example.utils.DeserializationData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {

        DeserializationData deserializationData = new DeserializationData();
        List<Airplane> airplaneList = deserializationData.readFile();

        airplaneList.forEach(System.out::println);
    }
}
