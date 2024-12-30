import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        int[] UserInputs = new int[5];
        System.out.println(Arrays.toString(UserInputs));
        try (Scanner input = new Scanner(System.in)) {

            for (int i = 0; i < UserInputs.length; i++) {
                
                System.out.print(String.format("Give input at UserInputs Index [%d] = ", i));
                UserInputs[i] = input.nextInt();
                System.out.println(Arrays.toString(UserInputs));
            }
        }
    }
}