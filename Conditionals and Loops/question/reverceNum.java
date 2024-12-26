package question;

public class reverceNum {
    public static void main(String[] args) {
        int num = 123;

        int reverce = 0;

        while (num>0) {
            int remender =num % 10 ;
            num /=10;
            reverce = reverce* 10 + remender ;
        }
        System.out.println(reverce);
    }
}
