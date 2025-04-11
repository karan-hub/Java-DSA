package Basics;// package Step 1 : Learn the basics;

public class IfElse {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;
        String result = compareNM(n, m);
        System.out.println("The comparison result is: " + result);
    }
    public static String compareNM(int n, int m) {
        if(n==m){
            return "equal" ;
        }else if(n<m){
            return "lesser" ;
        }else{
            return "greater" ;
        }
        
        // code here
    }
}
