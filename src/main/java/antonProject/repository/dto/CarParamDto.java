package antonProject.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarParamDto {
    private Integer carId;
    private String category;
    private String brand;
    private String numberState;
    private String nameOwner;
    private String surnameOwner;
    private Integer regionCode;

    public CarParamDto(Integer carId, Integer regionCode) {
        this.carId = carId;
        this.regionCode = regionCode;
    }
}
