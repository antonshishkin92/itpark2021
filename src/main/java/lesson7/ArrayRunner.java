package lesson7;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayRunner {
    public static void main(String[] args) {
        Integer[] nums ={78,65,123,11};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("--------------------");
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums));
    }
}
