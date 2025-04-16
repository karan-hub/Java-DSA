package StringsBasicMedium;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DifferentIntegersinString {
    public static void main(String[] args) {
        System.out.println( numDifferentIntegers("a123bc34d8ef34"));

    }
    public static int numDifferentIntegers(String word) {
         Set<String> set = new HashSet<>();
          StringBuilder num = new StringBuilder();
          for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch))  num.append(ch);
             else {
                 if (num.length() > 0) {
                     set.add(new BigInteger(num.toString()).toString());
                     num.setLength(0);
                }
            }
        }
         if (num.length() > 0) set.add(new BigInteger(num.toString()).toString());
         return set.size();
    }
}
