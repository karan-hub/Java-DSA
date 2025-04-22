package Sort.MargeSort;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int [] arr = {5,2,1,8};
//        arr= Sort(arr);
        System.out.println(Arrays.toString(arr));
        InplaceSort(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static  int[] Sort(int [] arr){
        if (arr.length == 1) return  arr;

        int mid = arr.length /2;

        int []left = Sort(Arrays.copyOfRange(arr ,0 , mid));
        int [] right = Sort(Arrays.copyOfRange(arr ,mid ,arr.length));

        return Marge(left , right);
    }

    static  int[] Marge(int []left , int [] right ){
        int [] mix = new int[left.length + right.length];

        int i=0,j=0,k=0;

        while (i< left.length && j < right.length){
            if (left[i]< right[j]){
                mix[k]=left[i] ;
                i++;
            }else {
                mix[k]=right[j] ;
                j++;
            }
            k++;
        }

        while (i< left.length){
            mix[k]=left[i] ;
            i++;
            k++;
        }
        while (  j < right.length){

                mix[k]=right[j] ;
                j++;
            k++;
        }
        return  mix;
    }



    static  void InplaceSort(int[] arr , int start , int end){
        if ((end -start) == 1) return;

        int mid = (start+end)/2;
        InplaceSort(arr, start, mid);
        InplaceSort(arr, mid, end);
        InplaceMerge(arr , start , mid , end );
    }

    static  void InplaceMerge(int[]arr , int start , int mid , int end){
        int  [] mix  = new int[end -start];
        int i=start;
        int j =mid;
        int k =0 ;

        while (i < mid && j < end ){
            if (arr[i] < arr[j]){
                mix[k] =arr[i] ;
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid ) {
            mix[k] =arr[i] ;
            i++;
            k++;
        }
        while (j < end ) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(mix, 0, arr, 0 + start, mix.length);


    }
}
