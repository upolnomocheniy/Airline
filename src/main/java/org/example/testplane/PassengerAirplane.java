package org.example.testplane;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PassengerAirplane extends Airplane {

    private String bd;

    public PassengerAirplane(String test, String bd) {
        super(test);
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "Passenger airplane{ " +
                "test='"+ super.getTest() + '\'' +
                ", bd='" + bd + '\'' +
                "}";
    }
}
