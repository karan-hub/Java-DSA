package Sort.CyclicSort;

public class duplicates {
    public static void main(String[] args) {
        duplicates obj = new duplicates();
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number is: " + obj.find(arr));
        
    }
    public int find(int[] arr) {
       

        int n = arr.length;
        int i = 1;
        while (i < n) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != i + 1) {
                if (arr[i] != arr[correctIndex])

                    swap(arr, i, correctIndex);
                else
                return arr[i] ;

            }else i++;
        }
         

        return -1;

    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;

    }
}
