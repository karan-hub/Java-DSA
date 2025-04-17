package Problem_Of_The_Day.src;

public class EqualDivisiblePairs {
    public static void main(String[] args) {

        System.out.println(countPairs(new  int[]{3,1,2,2,2,1,3}));
    }
//    brust force

     static  int  countPairs(int[] arr ){
        int count =0;
         for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 if (arr[i]== arr[j] && ((i *j) %2 ==0) ){
                     count++;
                 }
             }
         }
         return  count;

     }
}
