package ArrayEasyMediumHard.Easy;

public class SortedArraySearch {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 6};
        int k = 6;
        boolean result = Search(arr, k);
        System.out.println("Element " + k + " found: " + result);
    }

    public static boolean Search(int []arr, int k){



        for (int i : arr) {
            if (i ==k) {
                return true;
            }
        }
        return false;
    }
}
