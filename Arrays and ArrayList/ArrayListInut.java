import java.util.ArrayList;

public class ArrayListInut {
    public static void main(String[] args) {
        // Sysntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);

        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.set(2, null);
        System.out.println(list);
    }

}