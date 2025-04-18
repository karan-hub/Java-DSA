package RecursionOnArrays;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{1,2,13,4,5}, 0 , 13 ));

    }

    static  boolean find(int [] arr , int index , int target){
        if (index == arr.length-1) return false;
       return  arr[index] == target ||  find(arr ,++index ,target);

    }
    static  int findIndex(int [] arr , int index , int target){
        if (index == arr.length-1) return -1;
        else if (arr[index] == target) return  index;
        else   return  findIndex(arr ,++index ,target);

    }
}
