package BinarySearchEasyMediunHard.Easy;

public class FrequncyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;
        System.out.println(countFreq(arr, target));
    }

    private static int countFreq(int[] arr, int target) {
            return   higher(arr, target) - lower(arr, target) ;
    }
    private static int lower(int[] arr, int target) {
        int l =  arr.length;

        int start =0 ,  end = arr.length-1 ;
        while (start <= end){
            int mid =( start+end)/2;
            if (arr[mid] >= target){
                l= mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return l ;

    }
    private static int higher(int[] arr, int target) {
        int h =  arr.length;

        int start =0 ,  end = arr.length-1 ;
        while (start <= end){
            int mid =( start+end)/2;
            if (arr[mid] >  target){
                h= mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }


        return h ;
    }


}
