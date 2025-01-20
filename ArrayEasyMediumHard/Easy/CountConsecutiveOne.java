package ArrayEasyMediumHard.Easy;

public class CountConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int result = CountMaximumConsecutiveOne(arr);
        System.out.println("Maximum consecutive ones: " + result);
    }

    public static int CountMaximumConsecutiveOne(int arr[]) {
        int count = 1;
        int sum = 0;
        for (int number : arr) {
            if (number == 1) {
                sum++;
            } else {

                sum = 0;
            }
            if (count < sum) {
                count = sum;
            }

        }

        return count;
    }
}
