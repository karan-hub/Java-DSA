package RecursionBasic;

public class StepstoReduceZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));

    }
    public static int numberOfSteps(int num) {
        return  helper(num, 0);

    }

    public static  int helper(int num , int step) {
        if (num==0) return step;
        if (num %2 == 0) return  helper(num/2 ,++step);
        else return  helper(num-1 ,++step);

    }

}
