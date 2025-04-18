package RecursionOnArrays;

public class isSortedArray {
    public static void main(String[] args) {
        System.out.println(sorted(new int[]{1,2,13,4,5}, 0 ));

    }

    static  public  boolean sorted(int [] arr , int idx){
        if (idx == arr.length-1) return true;
        return  arr[idx]<arr[idx+1] && sorted(arr, ++idx);
    }
}
