package Sort.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]  arr ={ 7, 4, 1, 5, 3} ;
        quickSort(arr , 0 ,  arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static  void  quickSort(int[] nums , int start , int end) {

        if (start < end){
            int pivot = partition(nums  , start , end) ;

            quickSort(nums, start, pivot-1);
            quickSort(nums, pivot+1, end);
        }
    }

    static   int partition (int [] arr , int start , int end ){
        int pivot  =  arr[end];
        int  i= start-1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot){
                i++;
//                swap
                int temp =  arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        i++;
        int temp =  arr[i];
        arr[i]= pivot;
        arr[end]=temp;
        return  i ;
    }



}
