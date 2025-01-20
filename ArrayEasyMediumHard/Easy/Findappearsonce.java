package ArrayEasyMediumHard.Easy;

public class Findappearsonce {

    public static void main(String[] args) {
        int[] arr = { 4, 4, 1, 2, 1, 2 };
        int result = appearsonce(arr);
        System.out.println("The element that appears once is: " + result);

    }

    public static int appearsonce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1)
                return arr[i];
        }
        return -1;
    }
}
