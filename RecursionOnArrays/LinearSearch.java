package RecursionOnArrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
//        System.out.println(findIndex(new int[]{1,2,13,4,5}, 0 , 13 ));
//        ListAllIndex(new int[]{1,2,2 ,13,4,5}, 0 , 2 , new ArrayList<>() );
//        System.out.println(list);
        System.out.println(ListAllIndex(new int[]{1,2, 2 ,13,4,5}, 0 , 2 ));


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
    static ArrayList<Integer> list = new ArrayList<>();
    static  void findAllIndex(int [] arr , int index , int target){
        if (index == arr.length-1) return ;
        else if (arr[index] == target)  list.add(index);
        findAllIndex(arr ,++index ,target);

    }
    static   ArrayList<Integer> ListAllIndex(int [] arr , int index , int target , ArrayList<Integer> result){
        if (index == arr.length)  return  result ;
        if (arr[index] == target)  result.add(index);
        return   ListAllIndex(arr ,++index ,target , list);
    }

//    withought passing argument
static   ArrayList<Integer> ListAllIndex(int [] arr , int index , int target ){
        ArrayList<Integer> result = new ArrayList<>();
    if (index == arr.length)  return  result ;
//    this only for that call
    if (arr[index] == target)   result.add(index);
    ArrayList<Integer> fromCall =    ListAllIndex(arr ,++index ,target );
    result.addAll(fromCall);
    return  result;
}
}
