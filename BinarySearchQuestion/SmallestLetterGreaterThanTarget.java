package BinarySearchQuestion;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };

        char[] letters2 = { 'x', 'x', 'y', 'y' };
        char target = 'x';
        char result = findSmallestLetter(letters2, target);
        System.out.println(result); // Expected output: 'y'
    }

    static char findSmallestLetter(char[] arr, char target) {
        int Start = 0;
        int End = arr.length - 1;

         while (Start <= End) {
            int mid = Start + (End - Start) / 2;

             if (arr[mid] <= target) {
                Start = mid + 1;
            } else {
                 End = mid - 1;
            }
        }

        // Circular array behavior
        return arr[Start % arr.length];
    }
}
