package ArrayEasyMediumHard.Hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    public static void main(String[] args) {
        int[] arr = { 11, 33, 33, 11, 33, 11 };
        List<Integer> ans = brutForce(arr);
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
}