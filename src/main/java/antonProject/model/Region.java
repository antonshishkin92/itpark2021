package antonProject.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @NotEmpty
    @Column(name = "name_Region", nullable = false)
    private String nameRegion;

    public Region(Long code, String nameRegion) {
        this.code = code;
        this.nameRegion = nameRegion;
    }

    public Long getRegionCode() {
        return code;
    }
}
