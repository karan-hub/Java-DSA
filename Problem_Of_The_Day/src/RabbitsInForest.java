package Problem_Of_The_Day.src;

import java.util.HashMap;
import java.util.Map;

public class RabbitsInForest {
    public static void main(String[] args) {
        int[] answers = {2, 2, 2, 1, 1};
        System.out.println(numRabbits(answers));

    }


    public static int numRabbits(int[] answers) {
        Map<Integer , Integer> map  = new HashMap<>();
        int total=0;
        for (int rabbit : answers){
            map.put(rabbit ,map.getOrDefault(rabbit ,0)+1);
        }

        for (int RBS : map.keySet()){
            int RBScount = map.get(RBS);
            int RBSgroup = RBS+1;
            int total_gropus = (int) Math.ceil((double) RBScount / RBSgroup);
            total += total_gropus *RBSgroup;
        }

        return total;
    }
}
