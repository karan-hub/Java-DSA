package BinarySearchEasyMediunHard.Easy;

public class koko {
    public static void main(String[] args) {

    }

    public int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        // ok
        int end = max(piles);
        int ans = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;
            // ok
            int calculatedHour = speed(mid, piles);
            // ok
            if (calculatedHour <= h) {
                end = mid - 1;
                ans = min(ans, calculatedHour);
            } else {
                start = mid + 1;
                ans = min(ans, calculatedHour);

            }

        }

        return ans;

    }

    public int max(int[] arr) {
        int max = arr[0];

        for (int element : arr)
            if (element > max)
                max = element;
        return max;
    }

    public int speed(int mid, int[] arr) {
        int totalTime = 0;
        // ok
        for (int element : arr)
            totalTime += ceil(element / mid);
        return totalTime;
    }

    public int min(int a, int b) {
        if (a < b)
            return a;
        return b;
    }

    public int ceil(double num) {
        return (num == (int) num) ? (int) num : (int) num + 1;
    }

}
