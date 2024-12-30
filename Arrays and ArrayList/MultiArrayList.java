import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println(list);


        for (int index = 0; index < 3; index++) {
            list.add(new ArrayList<>(3));
        }
        System.out.println(list.size());
        

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).size());
            for (int j = 0; j < 3; j++) {

                list.get(i).add(in.nextInt());
                
            }
        }
        System.out.println(list);


    }
}
