package Problem_Of_The_Day.src;

import java.util.HashMap;
import java.util.Map;

public class LargestGroup {
    public static void main(String[] args) {
int r =countLargestGroup(13);
        System.out.println(r);
    }
    public static int countLargestGroup(int n) {
        int maxSum =0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int digitSum = digitSum(i);

            map.put(digitSum , map.getOrDefault(digitSum ,0) +1);
            maxSum = Math.max(maxSum , map.get(digitSum));

        }
        int count = 0;

        for (int size : map.values()) {
            if (size == maxSum) {
                count++;
            }
        }
        return count ;

    }

    public  static  int digitSum(int num){
        int sum =0 ;

        while ( num !=0 ){
            sum += num%10;
           num = num / 10;
        }
        return  sum;
    }


}
