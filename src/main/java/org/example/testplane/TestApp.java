package org.example.testplane;

import org.example.utils.DeserializationData;

import java.io.IOException;

public class TestApp {
    public static void main(String[] args) throws IOException {
        DeserializationData deserializationData = new DeserializationData();
        deserializationData.readFile();
    }
}
