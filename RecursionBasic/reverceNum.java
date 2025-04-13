package RecursionBasic;

public class reverceNum {
    public static void main(String[] args) {
        System.out.println(reverse(12));


    }

    static int reverse(int number) {
        return reverce_Helper(number, 0);
    }
    static  int reverce_Helper(int Number , int  result){
        if (Number == 0 ) return   result;
        int last_digit = Number%10 ;
        return  reverce_Helper(Number /10 , result*10+last_digit);
    }

}
