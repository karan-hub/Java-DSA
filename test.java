public class test {
    public static void main(String[] args) {

        String s1 = new String("Karan");
        String s2 = new String("Karan");

        System.out.println(s1.equals(s2));     // true
        System.out.println(s1.hashCode());     // same hash
        System.out.println(s2.hashCode()==s1.hashCode());     // same hash

    }
}
