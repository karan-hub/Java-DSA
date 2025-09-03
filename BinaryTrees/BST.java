package BinaryTrees;

import java.util.Scanner;

public class BST<T extends  Comparable<T> > {


    private  static  class  Node<T>{
         private final T value ;
         private  Node<T> left;
         private  Node<T> right;
         public Node(T value) {
             this.value = value;
         }
         public T getValue() {
             return value;
         }
     }

     private  Node<T> root;
    public Node<T> getRoot() {
        return root ;
    }

    public T getValue() {
        return root.getValue() ;
    }

//     Insert in BST

    public void insert(Scanner scanner ){
        System.out.println("please Enter Root");
        Integer value = scanner.nextInt();
        root = insert((T) value, root);
    }

    public void insert(T element ){

        root = insert( element, root);
    }

    public  Node<T> insert(T value , Node node){
        if (node==null) return new Node<>(value);
        if (value.compareTo((T) node.getValue()) <0) node.left = insert(value , node.left);
        if (value.compareTo((T)node.getValue())>0) node.right = insert(value , node.right);
        return node;
    }
    private  void Inorder(Node<T> node ,  String indent){
        if (node == null )return;
        Inorder(node.left , indent+"\t");
        System.out.println(node.getValue());
        Inorder(node.right , indent+"\t");
    }

    private void preOrder(Node<T> node , String indent) {
        if (node ==null) return;
        System.out.println(indent+ node.value);
        preOrder(node.left,indent+"\t");
        preOrder(node.right,indent+"\t");
    }

    private void postOrder(Node<T> node , String indent) {
        if (node ==null) return;
        preOrder(node.left,indent+"\t");
        preOrder(node.right,indent+"\t");
        System.out.println(indent+ node.value);
    }

    public void display(Scanner scanner) {
        System.out.println("which order You Want \n prees 1 - PreOrder \n prees 2 - InOrder \n prees 3 - PostOrder");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> preOrder(this.root ," ");
            case 2 -> Inorder(this.root," ");
            case 3 -> postOrder(this.root," ");
            default-> System.out.println("Invalid Entry For " + choice);
        }
    }


    public     int heightOfTree(Node root){
        return  helper(root );
    }
    private int helper(Node root) {
        if (root == null) return -1; // base case: empty tree height = -1
        int leftHeight = helper(root.left);
//        System.out.println("leftHeight " + leftHeight);
        int rightHeight = helper(root.right);
//        System.out.println("rightHeight  "+ rightHeight +" leftHeight" + leftHeight +" total ->  " + (1 + Math.max(leftHeight, rightHeight))+"\n");
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        BST<Integer>  bst = new BST<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter u r Choice");
        while (true){
            int choice = scanner.nextInt();
            switch (choice){
               case  1 ->  bst.insert(scanner);
               case  2 ->bst.display(scanner);
                default -> {
                    return;
                }
            }
        }
    }


}
