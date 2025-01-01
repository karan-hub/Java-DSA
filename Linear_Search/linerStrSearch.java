package Linear_Search;

public class linerStrSearch {

    public static void main(String[] args) {
        String name = "karan";
      boolean result=  SearchStr(name, 'a');
        if (result == true) {
            System.out.println(" Charecter is present in this string");
        }else{
            System.out.println(" Charecter is not present in this string");

        }
    }

    static boolean SearchStr(String str, char c) {

        if (str.length() == 0) {
            return false;
        }

        for (int charIndex = 0; charIndex < str.length(); charIndex++) {
            if (str.charAt(charIndex) == c) {
                return true;
            }
        }
        return false;

    }
}