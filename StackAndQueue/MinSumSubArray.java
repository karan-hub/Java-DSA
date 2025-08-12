package StackAndQueue;

public class MinSumSubArray {
//    Brut Force
    public static int  sumSubarrayMins1(int[] arr) {
    int minSum = 0 ;
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++)
                minSum += getMin(arr,i ,j);
    return  minSum;
    }

    private static int getMin(int[] arr, int i, int j) {
        int minnum =  Integer.MAX_VALUE;
        while (i <= j){
            minnum = Math.min(minnum , arr[i]);
            i++;
        }

        return minnum;
    }

    public static void main(String[] args) {
        int result = sumSubarrayMins1(new int[]{3,1,2,4});
        System.out.println( "Brut Force "+result);
    }
}
