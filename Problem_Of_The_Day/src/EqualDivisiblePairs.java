package Problem_Of_The_Day.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualDivisiblePairs {
     ;

    public static void main(String[] args) {

        System.out.println(countPairs(new  int[]{3,1,2,2,2,1,3} , 2));
    }
//    brust force

     static  int  countPairs_b(int[] arr  , int k){
        int count =0;
         for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 if (arr[i]== arr[j] && ((i *j) % k ==0) ){
                     count++;
                 }
             }
         }
         return  count;

     }

//     optimal

    static  int countPairs(int[] arr  , int k){
        Map<Integer, List<Integer>> map = new HashMap<>();
        int count =0;
//        gout indices
        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], x -> new ArrayList<>() ).add(i);
        }
//      for each pair group of same number chack pair value
for (List<Integer> list :map.values()){
    int size = list.size();
    for (int i = 0; i < size; i++) {
        for (int j = i+1; j < size; j++) {
            int a = list.get(i);
            int  b = list.get(j);

            if ((a*b) % k == 0) count++;
        }
    }
}

        return  count;
    }
}
