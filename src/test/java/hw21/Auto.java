package hw21;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Auto {
    public String brand;
    public String model;
    public double fuelConsumption;
    public double tankCapacity;
    public double distanceWithoutRefueling;

    public double distanceWithoutRefueling() {
        return distanceWithoutRefueling = (100 / fuelConsumption) * tankCapacity;
    }
}
