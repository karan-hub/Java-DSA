package Step 1 : Learn the basics;

public class ReferenceandValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int[] result = passedBy(x, y);
        System.out.println("x: " + x + ", y: " + y);
        System.out.println("result: " + result[0] + ", " + result[1]);
    }
    static int[] passedBy(int a, int b) {
        // code here
        a = a+1; 
        b=b+2 ;
        return  new int[]{a,b} ;
    }
}
