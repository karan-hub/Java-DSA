package RecursionPattern;

import java.sql.Array;
import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        ArrayList<String >  list = numRollsToTarget("" ,4);
        System.out.println(list);
    }

    public static ArrayList<String > numRollsToTarget(String process, int target) {

        if (target == 0 ) {
            ArrayList<String > list = new ArrayList<>();
            list.add(process);
            return  list ;
        }
        ArrayList<String > list = new ArrayList<>();

        for (int i = 1; i <=6 && i <= target ; i++)
            list.addAll(numRollsToTarget(process+i , target-i));

        return  list ;
    }
}
