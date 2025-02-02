package ArrayEasyMediumHard.Hard;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

        int[] arr = { -1, 0, 1, 2, -1, -4 };
        Set<List<Integer>> set = brutForce(arr);
        for (List<Integer> list : set) {
            System.out.println(Arrays.toString(list.toArray()));
        }

    }

    public static Set<List<Integer>> brutForce(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    List<Integer> list = new ArrayList<>();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if (!set.contains(list)) {
                            set.add(list);
                        }

                    }
                }
            }
        }
        return set;

    }
}
