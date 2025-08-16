package BinaryTrees;

import java.util.Scanner;

public class BinaryTree {
    private static class  Node{
        private final int value;
        private Node right;
        private Node left;
        Node(int value){
            this.value=value;
        }
        public int getValue() {
            return value;
        }
    }

    private  Node root;

    public int getRoot() {
        return root.value;
    }

    //    insert
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node");
        int val = scanner.nextInt();
        root= new Node(val);
        populate(scanner , root);
    }

    public void populate(Scanner scanner , Node node){
        System.out.println("Do u want to add element left to the "+ node.value);
        boolean left= scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of the left of " + node.value);
            int val = scanner.nextInt();
            node.left= new Node(val);
            populate(scanner , node.left);
        }

        System.out.println("Do u want to add element Right to the"+ node.value);
        boolean right= scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value of the right of " + node.value);
            int val = scanner.nextInt();
            node.right= new Node(val);
            populate(scanner , node.right);
        }
    }


    public void display(Scanner scanner) {
        System.out.println("which order You Want \n prees 1 - PreOrder \n prees 2 - InOrder \n prees 3 - PostOrder");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> preOrder(this.root);
            case 2 -> inOrder(this.root);
            case 3 -> postOrder(this.root);
            default-> System.out.println("Invalid Entry For " + choice);
        }
    }

    private void preOrder(Node node) {
        preOrder(node,"");
    }
    private void preOrder(Node node , String indent) {
        if (node ==null) return;
        System.out.println(indent+ node.value);
        preOrder(node.left,indent+"\t");
        preOrder(node.right,indent+"\t");
    }

    private void postOrder(Node node) {
        postOrder(node," ");
    }
    private void postOrder(Node node , String indent) {
        if (node ==null) return;
        preOrder(node.left,indent+"\t");
        preOrder(node.right,indent+"\t");
        System.out.println(indent+ node.value);
    }

    private void inOrder(Node node) {
        inOrder(node,"");
    }
    private void inOrder(Node node , String indent) {
        if (node ==null) return;
        preOrder(node.left,indent+"\t");
        System.out.println(indent+ node.value);
        preOrder(node.right,indent+"\t");
    }


}
