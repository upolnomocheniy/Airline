package org.example.testplane;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public abstract class TestB {
    private String name;
    private String fuel;
    private String capacity;
}
