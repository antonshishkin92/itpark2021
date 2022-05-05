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
    private Long id;

    @NotEmpty
    @Column(name = "name_Region", nullable = false)
    private String nameRegion;

    public Region(Long id, String nameRegion) {
        this.id = id;
        this.nameRegion = nameRegion;
    }

    public Long getRegionId() {
        return id;
    }
}
