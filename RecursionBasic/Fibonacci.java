package RecursionBasic;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Series(5));

    }

    static  int Series(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return  Series(n-1)+ Series(n-2);
        
    }
}
