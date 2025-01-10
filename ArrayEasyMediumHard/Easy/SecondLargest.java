package ArrayEasyMediumHard.Easy;

import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int result = BatterApproach(arr);
        System.out.println("The second largest element is: " + result);
        
    }

    public static int BruteForce(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        return arr[arr.length-2];
    }


    public static int BruteForce2(int[] arr) {
        // Code Here
        int max = arr[0];
        int secondmax = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : arr) {
            if (i < max) {
                secondmax = i;
                
            }
        }
        return secondmax;
    }

    public static int BatterApproach(int[] arr) {
        // Code Here
        int max = arr[0];
        int secondmax = arr[0];
        for (int i : arr) {
            max = Math.max(max, i);
        }
        for (int i : arr) {
            if (i != max) {
                secondmax = Math.max(secondmax, i);
            }
        }
         
        return secondmax;
    }
}
