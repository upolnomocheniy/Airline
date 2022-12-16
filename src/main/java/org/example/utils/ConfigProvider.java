package org.example.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConfigProvider {
    private static final Properties properties = new Properties();
    public static final String PATH_TO_PROPERTY = "src/main/resources/configuration/parameters.properties";

    static {
        try (InputStream input = new FileInputStream(PATH_TO_PROPERTY)) {
            properties.load(input);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String propertyName) {
        return System.getProperty(propertyName, properties.getProperty(propertyName));
    }
}