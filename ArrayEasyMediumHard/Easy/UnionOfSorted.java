package ArrayEasyMediumHard.Easy;

import java.util.ArrayList;

 

public class UnionOfSorted {
    public static void main(String[] args) {
        int[] A = { -6, -4, -2, 3, 8 };
        int[] B = { -9, -8, -7, -5, -2, 1, 2, 2, 6, 9 };
        ArrayList<Integer> unionList = TwopointeronSortedArray(A, B);
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

    public static ArrayList<Integer> TwopointeronSortedArray(int[] A, int[] B) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
           
            if (A[i] == B[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != A[i]) {
                    list.add(A[i]);
                }
                i++;
                j++;

            } else if (A[i] < B[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != A[i]) {

                    list.add(A[i]);
                }
                i++;

            } else {

                if (list.isEmpty() || list.get(list.size() - 1) != B[j]) {

                    list.add(B[j]);
                }
                j++;
            }

        }


        while (i< A.length) {
            if (list.isEmpty() || list.get(list.size()-1) != A[i]) {
                list.add(A[i]);
            }
            i++;
        }
        while (j< B.length) {
            if (list.isEmpty() || list.get(list.size()-1) != B[j]) {
                list.add(B[j]);
            }
            j++;
        }
        return list;
    }
}
