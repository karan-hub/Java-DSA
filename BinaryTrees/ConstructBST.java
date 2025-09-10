package BinaryTrees;

import java.util.Scanner;

public class ConstructBST {
    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }
    static  BST<Integer> bst = new BST<>();
   static public void populatedSorted(int[] nums , int start , int end) {

       if (start >= end) return;
       int mid = (start+end)/2;
       bst.insert(nums[mid]);
       populatedSorted(nums,start , mid);
       populatedSorted(nums , mid+1 , end);
    }

    public static void main(String[] args) {
        int [] arr=new int[]{1, 2, 3, 4, 5, 6, 7};
        populatedSorted(arr,0 , arr.length);
        Scanner sc = new Scanner(System.in);
        bst.display(sc);
        System.out.println("height of tree");
        int result = bst.heightOfTree(bst.getRoot());
        System.out.println(result);

    }
}
