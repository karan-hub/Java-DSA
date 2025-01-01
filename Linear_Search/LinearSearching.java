package Linear_Search;
public class LinearSearching {

    public static void main(String[] args) {
        int[] arr = { 12, 23, 45, 67, 89, 98, 76, 54, 43, 421, 42 };

        int result = LinearSearch(arr, 12); // Fixed method name
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }

    static int LinearSearch(int[] arr, int target) { // Fixed method name
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }
}
