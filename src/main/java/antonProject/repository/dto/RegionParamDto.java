package antonProject.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegionParamDto {
    private Integer codeRegion;
    private String nameRegion;

    public RegionParamDto(Integer codeRegion) {
        this.codeRegion = codeRegion;
    }

    public RegionParamDto(String nameRegion) {
        this.nameRegion = nameRegion;
    }
}
