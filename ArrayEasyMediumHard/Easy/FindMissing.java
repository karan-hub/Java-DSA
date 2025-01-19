package ArrayEasyMediumHard.Easy;

class FindMissing {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };

        int missingNumber = missingBrutForce1(arr);
        System.out.println("The missing number is: " + missingNumber);


        int missingNumberSummation = SummationApproach(arr);
        System.out.println("The missing number using summation approach is: " + missingNumberSummation);
    }

    // brut force
    public static int missingBrutForce1(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int flag = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0)
                return i;
        }

        return -1;
    }

    // Summation Approach:

    public static int SummationApproach(int arr[]) {

        int N = arr[arr.length - 1];

        int s1 = (N * (N + 1)) / 2;
        int s2 = 0;
        for (int i : arr) {
            s2 += i;
        }

        return s1 - s2;
    }
}