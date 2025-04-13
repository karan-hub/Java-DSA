package RecursionBasic;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(010));

    }

    static   int  sum( int number) {
        if (number ==0 ) return  0;
        return  (number % 10) + sum(number/10);
    }
}
