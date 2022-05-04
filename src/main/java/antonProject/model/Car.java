package antonProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "category",nullable = false)
    private String category;

    @NotEmpty
    @Column(name = "brand",nullable = false)
    private String brand;

    @NotEmpty
    @Column(name = "model",nullable = false)
    private String model;

    @NotEmpty
    @Column(name = "number_car",nullable = false)
    private String numberCar;

    @NotEmpty
    @Column(name = "region",nullable = false)
    private Integer region;

    public Car(Integer id, String category, String brand, String model, String numberCar, Integer region) {
        this.id = id;
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.numberCar = numberCar;
        this.region = region;
    }
}
