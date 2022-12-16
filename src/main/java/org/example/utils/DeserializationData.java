package org.example.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.example.exception.NoSuchRecordsException;
import org.example.plane.dto.Airplane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.utils.ConfigProvider.getProperty;

public abstract class DeserializationData {

    public static final String PATH = getProperty("sourcePath");
    public static final String AIRPLANE_JSON_LIST = getProperty("sourceFile");

    public static List<Airplane> readFile() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

        List<Airplane> airplaneList = new ArrayList<>();

        try {
            airplaneList = Arrays.asList(mapper.readValue(new File(PATH + AIRPLANE_JSON_LIST), Airplane[].class));
        } catch (FileNotFoundException e) {
            System.out.println("File not found in system");
        } catch (MismatchedInputException e) {
            System.out.println(e.getMessage());
        }

        if (airplaneList.isEmpty()) {
            throw new NoSuchRecordsException("No Record found from airplane list");
        }

        return airplaneList;
    }
}
