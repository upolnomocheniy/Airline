package org.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProvider {
    private static final Properties properties = new Properties();
    public static final String PATH_TO_PROPERTY = "src/main/resources/configuration/parameters.properties";

    static {
        try (InputStream input = new FileInputStream(PATH_TO_PROPERTY)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String propertyName) {
        return System.getProperty(propertyName, properties.getProperty(propertyName));
    }
}