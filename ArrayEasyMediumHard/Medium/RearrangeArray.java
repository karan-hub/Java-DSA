package ArrayEasyMediumHard.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {

    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 ,23,54,65,78,6 };
        int[] rearrangedArray = Approch2(nums);
        System.out.println(Arrays.toString(rearrangedArray));

    }

    public static int[] Rearrange(int[] nums) {

        ArrayList<Integer> postiveNumbers = new ArrayList<>();
        ArrayList<Integer> negitiveNumbers = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < 0) {
                negitiveNumbers.add(nums[index]);
            } else {
                postiveNumbers.add(nums[index]);
            }
        }
        System.out.println(Arrays.toString(postiveNumbers.toArray()));
        System.out.println(Arrays.toString(negitiveNumbers.toArray()));

        int type = 1;
        int i = 0, j = 0;

        for (int index = 0; index < nums.length; index++) {
            if (type == 1) {
                nums[index] = postiveNumbers.get(i);
                i++;
                type = -1;
            } else {
                nums[index] = negitiveNumbers.get(j);
                j++;
                type = 1;
            }

        }

        return nums;

    }

    public static int[] OptimalApproch(int[] nums) {

        int[] result = new int[nums.length];
        int positiveIndex = 0, negitiveIndex = 1;

        for (int num : nums) {
            if (num < 0) {
                result[negitiveIndex] = num;
                negitiveIndex += 2;
            } else {
                result[positiveIndex] = num;
                positiveIndex += 2;
            }
            System.out.println(Arrays.toString(result));
        }

        return result;

    }

    public static int[] Approch2(int[] nums) {
        ArrayList<Integer> positiveList = new ArrayList<>();
        ArrayList<Integer> negitiveList = new ArrayList<>();
        int n = nums.length;

        for (int num : nums) {
            if (num < 0) {
                negitiveList.add(num);
            } else {
                positiveList.add(num);
            }
        }

        if (positiveList.size() > negitiveList.size()) {

            for (int i = 0; i < negitiveList.size(); i++) {
                nums[i * 2] = positiveList.get(i);
                nums[i * 2 + 1] = negitiveList.get(i);
            }
            int index = negitiveList.size() * 2;

            for (int i = negitiveList.size(); i < positiveList.size(); i++) {
                nums[index] = positiveList.get(i);
                index++;
            }
        } else {

            for (int i = 0; i < positiveList.size(); i++) {
                nums[i * 2] = positiveList.get(i);
                nums[i * 2 + 1] = negitiveList.get(i);
            }
            int index = positiveList.size() * 2;
            for (int i = positiveList.size(); i < negitiveList.size(); i++) {
                nums[index] = negitiveList.get(i);
                index++;
            }
        }
        return nums;

    }
}