package c3;

import java.util.ArrayList;

 
public class Tower {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> source = new ArrayList<>(java.util.Arrays.asList(4, 3, 2, 1));
        ArrayList<Integer> Assume = new ArrayList<>();
        ArrayList<Integer> destination = new ArrayList<>();
        list.add(source);
        list.add(Assume);
        list.add(destination);
        moveTower(n, list.get(0), list.get(1), list.get(2));
        // System.out.println(source.toString());
        // System.out.println(Assume.toString());

        // System.out.println(destination.toString());

    }

    static void moveTower(int n, ArrayList<Integer> source, ArrayList<Integer> assume,
            ArrayList<Integer> destination) {
        if (n == 0) {
            return;
        }
        moveTower(n - 1, source, destination, assume);
        System.out.println( "scource >" + source.toString() + "  destination =>" + destination.toString() +"   assume=>" +assume.toString() );
        int num = source.remove(source.size() - 1);
        // System.out.println( A.toString());

        
        destination.add(num);

        moveTower(n - 1, assume, source, destination);
        // System.out.println( destination.toString());

    }
}
