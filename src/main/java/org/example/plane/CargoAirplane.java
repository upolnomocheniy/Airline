package org.example.plane;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CargoAirplane {

    private String zubaKrut;

    public CargoAirplane(String test, String bd) {

        this.zubaKrut = bd;
    }


}
