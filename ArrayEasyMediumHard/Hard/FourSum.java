package ArrayEasyMediumHard.Hard;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {

        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> ans = optimalApproch(nums, 0);
        for (List<Integer> list : ans) {
            System.out.println("result" + list.toString());
        }

    }

    public static Set<List<Integer>> brutForce(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == target) {
                            List<Integer> list = new ArrayList<>();
                            list.addAll(List.of(nums[i], nums[j], nums[k], nums[l]));

                            // Collections.sort(list);
                            set.add(list);
                        }

                    }
                }
            }
        }

        return set;

    }

    // TC -> n^3
    // Sc -> O(n)+ O(logN)
    public static Set<List<Integer>> batterApproch(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Set<Integer> map = new HashSet<>();
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[k] + nums[j];
                    int L = target - sum;
                    if (map.contains(L)) {
                        List<Integer> list = new ArrayList<>();
                        list.addAll(List.of(nums[i], nums[j], nums[k], L));
                        Collections.sort(list);
                        set.add(list);

                    }
                    map.add(nums[k]);
                }
            }
        }

        return set;

    }

    public static List<List<Integer>> optimalApproch(int[] nums, int target) {

        List<List<Integer>> set = new ArrayList<>();
        if (nums == null || nums.length < 4)
            return set; // Edge case

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.addAll(List.of(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        set.add(list);

                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                        while (k < l && nums[l] == nums[l + 1])
                            l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }

            }
        }

        return set;
    }

}
