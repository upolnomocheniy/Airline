package org.example.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.example.testplane.TestAirplane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.utils.ConfigProvider.getProperty;

public class DeserializationData {

    public static final String PATH = getProperty("sourcePath");
    public static final String AIRPLANE_JSON_LIST = getProperty("sourceFile");

    public List<TestAirplane> readFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<TestAirplane> airplaneList = new ArrayList<>();

        try {
            airplaneList = Arrays.asList(mapper.readValue(new File(PATH + AIRPLANE_JSON_LIST), TestAirplane[].class));
        } catch (FileNotFoundException e) {
            System.out.println("FIle not found in system");
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
        }

        airplaneList.forEach(System.out::println);

        return airplaneList;
    }
}
