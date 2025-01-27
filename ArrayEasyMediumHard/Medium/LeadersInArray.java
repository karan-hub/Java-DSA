package ArrayEasyMediumHard.Medium;

import java.util.ArrayList;
import java.util.List;

import Linear_Search.linerStrSearch;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] nums = { 16, 17, 4, 3, 5, 2 };
        List<Integer> leaders = Leaders(nums);
        System.out.println(leaders);
    }

    public static List<Integer> Leaders(int[] nums) {
        List<Integer> resuList = new ArrayList<>();
        for (int learder = 0; learder < nums.length; learder++) {
            boolean add = true;
            for (int num = learder + 1; num < nums.length; num++) {
                if (nums[num] > nums[learder]) {
                    add = false;
                    break;

                }
            }
            if (add) {
                resuList.add(nums[learder]);
            }
        }

        return resuList;

    }
}