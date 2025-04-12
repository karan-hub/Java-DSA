package ArrayEasyMediumHard.Medium;


import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxCircularSubarraySum {
    public static void main(String[] args) {
        MaxCircularSubarraySum MCS =new MaxCircularSubarraySum();
        int [] arr = new int[]{1, -2, 3, -2};
        int result =MCS.circularSubarraySum(arr);
        System.out.println(result);
        

    }
    public int circularSubarraySum(int[] arr) {

        int maxKadance  = arr [0] , maxEndingKadance =arr[0];
        int minKadance  = arr [0] ,  minEndingKadance = arr[0];
        int totalSun =0;



        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            totalSun +=num;
            maxEndingKadance =  Math.max(num , maxEndingKadance+num);
            maxKadance = Math.max(maxKadance , maxEndingKadance);

            minEndingKadance =  Math.min(num , maxEndingKadance+num);
            minKadance = Math.min(minEndingKadance ,  minKadance);

        }

        totalSun +=arr[0];
        if ( maxKadance <0 ) return maxKadance;

        return Math.max(maxKadance , totalSun-minKadance);
    }
}

