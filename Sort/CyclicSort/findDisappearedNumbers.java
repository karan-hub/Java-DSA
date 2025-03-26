package Sort.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        findDisappearedNumbers finder = new findDisappearedNumbers();
        List<Integer> result = finder.find(arr);
        System.out.println(result);

    }

    public List<Integer> find(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correctIndex = arr[i]-1;
            if ( arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else
                i++;
        }
        for (int j = 0; j < arr.length; j++)
            if (arr[j] !=  j+1) list.add(j+1);
            
        // if (list.isEmpty())
        //     list.add(arr.length);
        return list;

    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;

    }
}
