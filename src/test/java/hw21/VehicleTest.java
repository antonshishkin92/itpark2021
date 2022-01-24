package hw21;


import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void shouldVehicleCanDistanceWithoutRefueling(){
        Auto hyundaiAccent=new Auto("Hyundai Accent","Accent",9.9,45,0);
        Assert.assertEquals(454.54,hyundaiAccent.distanceWithoutRefueling(),hyundaiAccent.distanceWithoutRefueling());

        Auto manTGA=new Auto("Man","TGA",25,260,0);
        Assert.assertEquals(1040,manTGA.distanceWithoutRefueling(), manTGA.getDistanceWithoutRefueling());
    }

}
