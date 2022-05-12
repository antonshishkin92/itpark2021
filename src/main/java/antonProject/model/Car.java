package antonProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Cars")
public class Car {
    @Id
    @Column(name = "Car_id")
    private Integer id;

    @NotEmpty
    @Column(name = "category", nullable = false)
    private String category;

    @NotEmpty
    @Column(name = "brand", nullable = false)
    private String brand;

    @NotEmpty
    @Column(name = "number_state", nullable = false)
    private String numberState;

    @NotEmpty
    @Column(name = "name_owner", nullable = false)
    private String nameOwner;

    @NotEmpty
    @Column(name = "surname_owner", nullable = false)
    private String surnameOwner;

    @NotEmpty
    @OneToOne(targetEntity = Region.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id")
    private Integer region;

    public Car(Integer id, String category, String brand, String numberState, String nameOwner, String surnameOwner, Integer region) {
        this.id = id;
        this.category = category;
        this.brand = brand;
        this.numberState = numberState;
        this.nameOwner = nameOwner;
        this.surnameOwner = surnameOwner;
        this.region = region;
    }

    public Integer getCarId() {
        return id;
    }

    public Integer getRegion() {
        return region;
    }
}
