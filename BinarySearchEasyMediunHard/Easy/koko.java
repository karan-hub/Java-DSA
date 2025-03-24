package BinarySearchEasyMediunHard.Easy;

public class koko {
    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        koko obj = new koko();
        int result = obj.minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);

    }

    public int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        // ok
        int end = max(piles);
 
        while (start <= end) {
            int mid = (start + end) / 2;
            // ok
            int calculatedHour = speed(mid, piles);
            // ok
            if (calculatedHour <= h) {
                end = mid - 1;
             } else {
                start = mid + 1;
             }
        }
        return start;

    }

    public int max(int[] arr) {
        int max = arr[0];

        for (int element : arr)
            if (element > max)
                max = element;
        return max;
    }

    public int speed(int mid, int[] v) {
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) 
        totalH += Math.ceil((double)(v[i]) / (double)(mid));
        return totalH;
    }

    public int min(int a, int b) {
        if (a < b)
            return a;
        return b;
    }
 

}
