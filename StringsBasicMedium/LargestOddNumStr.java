package StringsBasicMedium;

public class LargestOddNumStr {
    public static void main(String[] args) {
        
        LargestOddNumStr solution = new LargestOddNumStr();
        System.out.println(solution.largestOddNumber("52")); // Output: "5"
        System.out.println(solution.largestOddNumber("4206")); // Output: ""
        System.out.println(solution.largestOddNumber("35427")); // Output: "35427"
    }
    public String largestOddNumber(String num) {
        for (int i = num.length()-1; i >=0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 !=0) return num.substring(0, i+1);
        }
     
        return  "";
    }
}
