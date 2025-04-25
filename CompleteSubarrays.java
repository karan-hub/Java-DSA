import java.util.*;

public class CompleteSubarrays {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 2};
        System.out.println(countCompleteSubarrays(nums)); // Output: 4

    }

    public static int countCompleteSubarrays(int[] nums) {
        int  count = 0 ;
        int i=0 , j =0 ;
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }

        Map<Integer , Integer > map = new HashMap<>();
        while (j < nums.length){
            map.put(nums[j] , map.getOrDefault(nums[j] ,0 )+1);

            while (map.size() ==  s.size()){
                count += (nums.length-j);

                map.put( nums[i]  , map.get(nums[i])-1);
                if (map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
            }
j++;

        }

        return  count ;


    }
}
