package ArrayEasyMediumHard.Hard;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {

        int[] nums = { -1, 0, 1, 2, -1, -4 };
        Set<List<Integer>> ans = batterApproch(nums, 0);
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
                            Collections.sort(list);
                            set.add(list);
                        }

                    }
                }
            }
        }

        return set;

    }

    // TC -> n^3
    //  Sc -> O(n)+ O(logN)
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

     

}
