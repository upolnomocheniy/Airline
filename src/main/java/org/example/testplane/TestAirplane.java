package org.example.testplane;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
public class TestAirplane{

    private String id;
    private List<String> test = new ArrayList<>();
    private Size size = new Size();

    @Data
    public static class Size {
        private String height;
        private String weight;
        private String width;
    }
}
