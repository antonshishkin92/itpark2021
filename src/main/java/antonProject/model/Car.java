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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Column(name = "category", nullable = false)
    private String category;

    @NotEmpty
    @Column(name = "brand", nullable = false)
    private String brand;

    @NotEmpty
    @Column(name = "model", nullable = false)
    private String model;

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
    @OneToOne(targetEntity = Region.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id")
    private long region;

    public Car(long id, String category, String brand, String model, String numberState, String nameOwner, String surnameOwner, long region) {
        this.id = id;
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.numberState = numberState;
        this.nameOwner = nameOwner;
        this.surnameOwner = surnameOwner;
        this.region = region;
    }

    public long getCarId() {
        return id;
    }

    public long getRegion() {
        return region;
    }
}
