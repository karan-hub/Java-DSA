package RecursionBasic;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(facto_of(5));
    }
 static   int facto_of(int num){
        if (num == 1) return  1;
        return  num * facto_of(num-1);
 }
}
