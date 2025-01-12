package ArrayEasyMediumHard.Easy;

import java.util.ArrayList;

public class UnionOfSorted {
    public static void main(String[] args) {

        int[] A = { 2, 2, 3, 4, 5 };
        int[] B = { 1, 1, 2, 3, 4 };
        ArrayList<Integer> unionList = Union(A, B);
        System.out.println("Union of A and B: " + unionList);

    }

    public static ArrayList<Integer> Union(int[] A, int[] B) {

        ArrayList<Integer> list = new ArrayList<>();

        int max = A.length < B.length ? B.length : A.length;

        for (int i = 0; i < max; i++) {
            if (i < A.length && !list.contains(A[i])) {
                
                list.add(A[i]);
            }
            if (i < B.length && !list.contains(B[i])) {
                list.add(B[i]);
            }
        }

        list.sort(null);
        return list;
        

    }
}
