package ArrayEasyMediumHard.Easy;

public class LeftArraybyOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums.length);
        int[] result = BruteForce(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] BruteForce(int[] nums ){

        int frist= nums[0];
        int [] temp = new int[nums.length];
        int j=0;
        for (int i = 1; i < nums.length ; i++) {
            temp[j]=nums[i];
            j++;
        }
        temp[nums.length-1]= frist;
        return temp;
    }
}
