package StackAndQueue;

public class subArrayRanges {
    public static void main(String[] args) {
        System.out.println(Solution(new int[]{1,3,3}));

    }

    public  static  int Solution(int []arr){
        int resultSum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            int smallest =  Integer.MAX_VALUE ;
            int  largest =Integer.MIN_VALUE;
            for (int j = i; j <arr.length ; j++) {
                smallest = Math.min(smallest,arr[j]);
                largest=Math.max(largest,arr[j]);
                resultSum += (largest-smallest);
            }
        }
        return  resultSum;
    }


}
