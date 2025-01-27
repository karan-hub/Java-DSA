package ArrayEasyMediumHard.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import question.reverceNum;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 1 };
        List<Integer> leaders = OptimalApproch(nums);
        // int[] leaders = OptimalApproch(nums);
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

    public static List<Integer> OptimalApproch(int[] nums) {
        List<Integer> resuList = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;

        for (int index = nums.length - 1; index >= 0; index--) {
            if (nums[index] > maxi) {
                maxi = nums[index];
                resuList.add(maxi);
            }

        }
        reverse(resuList);

        return resuList;

    }

    public static void reverse(List<Integer> nums) {
        int i = 0;
        int j = nums.size() - 1;
        while (i < j) {
            // Swap elements at indices i and j
            int temp = nums.get(j);
            nums.set(j, nums.get(i));
            nums.set(i, temp);

            i++;
            j--;
        }
    }

}
