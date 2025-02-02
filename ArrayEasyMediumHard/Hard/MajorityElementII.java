package ArrayEasyMediumHard.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {

    public static void main(String[] args) {
        int[] arr = { 11, 33, 33, 11, 33, 11 };
        List<Integer> ans = batterApproch(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }

    // TC => O(n)^2
    // SC => O(1)
    public static List<Integer> brutForce(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (list.size() == 0 || list.get(0) != nums[i]) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                    if (count > nums.length / 3) {
                        list.add(nums[i]);
                        break;
                    }
                }

            }
            if (list.size() == 2) {
                break;
            }

        }

        return list;
    }

    public static List<Integer> batterApproch(int[] nums) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int minValue = (int) (nums.length / 3) + 1;

        for (int i = 0; i < nums.length; i++) {
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);

            if (map.get(nums[i]) == minValue) {
                list.add(nums[i]);
            }
            if (list.size() == 2) {
                break;
            }

        }
        Collections.sort(list);
        return list;
    }

    // Boyer Moore's Voting Algorithm

    public static List<Integer> optimaApproch(int[] nums) {

    }

}
