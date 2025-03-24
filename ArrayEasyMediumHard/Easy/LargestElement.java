package ArrayEasyMediumHard.Easy;

import java.util.Arrays;

 
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(BruteForce(arr));
    }
    
    public static int BruteForce(int[] arr) {
        int max = arr[0];
        for(int element :arr) if(element > max) max= element;
        
        
        return max;
        
    }


    public static int  BruteForce2(int[] arr){

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        return arr[arr.length-1];

    }
}
