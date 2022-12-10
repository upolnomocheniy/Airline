package org.example;

import org.example.utils.DeserializationData;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        DeserializationData deserializationData = new DeserializationData();
        deserializationData.readFile();
    }
}
