package lesson20.jaxb;

import lesson20.dto.Car;

import java.math.BigDecimal;

public class JAXBRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMark("Porshe");
        car.setModel("Tycan");
        car.setPrice(new BigDecimal("100000"));



    }
}
