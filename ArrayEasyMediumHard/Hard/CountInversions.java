package ArrayEasyMediumHard.Hard;

import java.util.Arrays;

//import static Sort.MargeSort.MargeSort.Marge;

public class CountInversions {

    public static void main(String[] args) {
//        int[] a = { 5, 3, 2, 4, 1 };
//        int cnt = brutForce(a);
//        System.out.println("The number of inversions is: " + cnt);


        int [] arr = {6,3,5,2,7};
        int in =  Sort(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(in);


    }

    // O(n)^2
    public static int brutForce(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    ans++;
                }
            }
        }

        return ans;

    }

    static  int  Sort(int [] arr  , int start , int end) {
        if ( (end - start) == 1) return  0 ;

        int mid =  (start +  end) /2;

        int left = Sort(arr ,start, mid);
        int  right = Sort(arr ,mid ,end);

       int m = InplaceMerge(arr , start , mid , end );
       return  m + left+right ;

    }

     static   int  InplaceMerge(  int [] arr ,int start, int mid , int  end ){
        int [] mix = new int[end-start];
        int  i = start, j = mid , k =0 ;
        int inv_count=0;

        while (i < mid && j < end ){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;

            }else {
                mix[k] =  arr[j];
                j++ ;
                inv_count += (mid -  i)  ;

            }
            k++;
        }

        while ( i < mid  ){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end){
            mix[k] = arr[j];
            j++;
            k++ ;
        }

         for (int l = 0; l < mix.length; l++) {
             arr[start+l ] = mix[l];
         }
        return   inv_count ;

     }

}