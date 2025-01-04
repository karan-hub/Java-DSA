package BinarySearchQuestion;

public class FloorElement {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        int result = findFloorElement(arr, target);

        if (result != -1) {
            System.out.println("The floor of " + target + " is: " + result);
        } else {
            System.out.println("No floor element found.");
        }
    }

    static int findFloorElement(int[] arr, int target) {

        int Start = 0;
        int end = arr.length - 1;
        int mid = 0;

        if (target > arr[end]) {
            return -1;
        }
        while (Start <= end) {
            mid = Start + (end - Start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                Start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }

        }

        return arr[end ];
    }
}