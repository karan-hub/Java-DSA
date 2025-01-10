package ArrayEasyMediumHard.Easy;

import java.util.ArrayList;
import java.util.Arrays;
 
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicatesArr(nums);
        System.out.println("Number of duplicates removed: " + result);
        
    }

    public  static int removeDuplicatesArr(int[] nums) {
        
        int count= 0;
        // int [ ] temp = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (i==1) {
                list.add(nums[i-1]);
                
            }
            if (nums[i] == nums[i-1]) {
                count++;
                
            }else{
                list.add(nums[i]);
            }
        }
            
        String str= Arrays.toString(list.toArray());
        System.out.println("Array without duplicates: " + str);
        return list.size();
    }
}
