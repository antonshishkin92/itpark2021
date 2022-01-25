package hw21;


import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void shouldVehicleCanDistanceWithoutRefueling(){
        Auto hyundaiAccent=new Auto("Hyundai","Accent",9.9,45,0);
        Assert.assertEquals(454.0,hyundaiAccent.distanceWithoutRefueling(),1.0);

        Auto kiaCeed = new Auto("Kia","Ceed",9.8,55,0);
        Assert.assertEquals(561.0,kiaCeed.distanceWithoutRefueling(),0.5);

        Auto manTGA=new Auto("Man","TGA",24.7,260,0);
        Assert.assertEquals(1052,manTGA.distanceWithoutRefueling(), 1.0);

        Auto volvoFH = new Auto(" Volvo", "FH", 14.4, 230,0);
        Assert.assertEquals(1597.0,volvoFH.distanceWithoutRefueling(),0.3);

    }


}
