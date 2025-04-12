package RecursionBasic;

public class nNames {
    public static void main(String[] args) {
        names("Karan", 5);

    }
    public static void names(String Name, int N) {
        if (N < 1) return;
        names(Name, N - 1);  // post-decrement logic
        System.out.println(Name);
    }

}
