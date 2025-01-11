package ArrayEasyMediumHard.Easy;

import java.util.ArrayList;
 
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        int result = Twopointers(nums);
        System.out.println("Number of duplicates removed: " + result);

    }

    public static int removeDuplicatesArr(int[] nums) {

        int count = 0;
        // int [ ] temp = new int[nums.length];

        ArrayList<Integer> list = new ArrayList<>();
        if (nums.length == 1) {
            list.add(nums[0]);
        }
        for (int i = 1; i < nums.length; i++) {
            if (i == 1) {
                list.add(nums[i - 1]);

            }
            if (nums[i] == nums[i - 1]) {
                count++;

            } else {
                list.add(nums[i]);
            }
        }
        int j = 0;
        for (Integer elemet : list) {
            nums[j++] = elemet;

        }
        return list.size();
    }

    public static int Twopointers(int[] nums) {
        if (nums.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        i++;
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
        }
        return i;

    }

}
