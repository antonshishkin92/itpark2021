package lesson20.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
@XmlRootElement(name="auto")
public class Car {

    private String mark;
    private String model;
    private BigDecimal price;
}
