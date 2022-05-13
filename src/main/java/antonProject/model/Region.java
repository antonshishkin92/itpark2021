package antonProject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Region")
public class Region {
    @Id
    @Column(name = "code_region")
    private Integer code;

    @NotEmpty
    @Column(name = "name_Region")
    private String nameRegion;

}
