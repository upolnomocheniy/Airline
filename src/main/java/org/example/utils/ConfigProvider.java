package org.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProvider {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = new FileInputStream("src/main/resources/configuration/parameters.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(String propertyName) {
        return System.getProperty(propertyName, properties.getProperty(propertyName));
    }
}