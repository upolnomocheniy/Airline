package com.epam.yevhen_kvitka.utils;

import com.epam.yevhen_kvitka.exception.NoSuchRecordsException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import com.epam.yevhen_kvitka.plane.dto.Airplane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.epam.yevhen_kvitka.utils.ConfigProvider.getProperty;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DeserializationData {

    public static final String PATH = getProperty("sourcePath");
    public static final String AIRPLANE_JSON_LIST = getProperty("sourceFile");

    public static List<Airplane> readFile() {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

        List<Airplane> airplaneList = new ArrayList<>();

        try {
            airplaneList = Arrays.asList(mapper.readValue(new File(PATH + AIRPLANE_JSON_LIST), Airplane[].class));
        } catch (FileNotFoundException | MismatchedInputException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (airplaneList.isEmpty()) {
            throw new NoSuchRecordsException("No Record found from airplane list");
        }

        return airplaneList;
    }
}
