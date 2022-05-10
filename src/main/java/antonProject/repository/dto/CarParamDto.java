package antonProject.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarParamDto {
    private Long carId;
    private String category;
    private String brand;
    private String numberState;
    private String nameOwner;
    private String surnameOwner;
    private Long regionCode;

    public CarParamDto(Long carId, Long regionCode) {
        this.carId = carId;
        this.regionCode = regionCode;
    }
}
