package ArrayEasyMediumHard.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
         int [][] ans = Solution(arr);
        System.out.print("The merged intervals are: \n");
        for (int [] it : ans) {
           System.out.println(Arrays.toString(it));
        }
        System.out.println();
    }

    // Sub-intervals
    public static List<List<Integer>> brutForce(int[][] nums) {
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i][0];
            int end = nums[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1))
                continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j][0] <= end) {
                    end = Math.max(end, nums[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));

        }

        return ans;

    }

    public static List<List<Integer>> optimalSolution(int[][] nums) {
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (ans.isEmpty() || nums[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(new ArrayList<>(Arrays.asList(Arrays.stream(nums[i])
                        .boxed()
                        .toArray(Integer[]::new))));

            } else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), nums[i][1]));
            }
        }

        return ans;

    }

    public static  int[][] Solution(int[][] nums) {
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        int[][] ans = new int[nums.length][2];
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (index == -1 || nums[i][0] > ans[index][1]) {
                index++;
                ans[index][0] = nums[i][0];
                ans[index][1] = nums[i][1];

            } else {
                ans[index][1] = Math.max(ans[index][1], nums[i][1]);
            }
        }

        return Arrays.copyOf(ans, index + 1);

    }

}
