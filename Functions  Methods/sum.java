import java.util.Scanner;

public class sum {

   static void numberSum(){
        try (Scanner in = new Scanner(System.in)) {
            int num1= in.nextInt();
            int num2 = in.nextInt();

            System.out.println(num1+num2);
        }
    }
    public static void main(String[] args) {
        numberSum();


    }
}
