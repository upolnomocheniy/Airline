package org.example.testplane;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CargoAirplane extends Airplane {

    private String zubaKrut;

    public CargoAirplane(String test, String bd) {
        super(test);
        this.zubaKrut = bd;
    }

    @Override
    public String toString() {
        return "Cargo airplane{ " +
                "test='"+ super.getTest() + '\'' +
                ", zubaKrut='" + zubaKrut + '\'' +
                "}";
    }
}
