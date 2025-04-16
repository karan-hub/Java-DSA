package StringsBasicMedium;

public class AddBinaryStrings {
    public static void main(String[] args) {
       String s1 = "1101", s2 = "111" ;

        System.out.println(addBinary(s1 ,s2));
    }
    public static String addBinary(String s1, String s2) {
        // code here
        StringBuilder ans = new StringBuilder();
        int  i =  s1.length()-1;
        int j = s2.length()-1;
        int carry =0 ;

        while ( i >= 0 || j >= 0 ){
            int ones = 0;
            if (i>= 0 && s1.charAt(i)=='1') ones++;
            if (j>= 0 && s2.charAt(j)=='1') ones++;
            int sum = ones + carry;

            if ( sum== 0){
                ans.append("0");
                carry = 0;
            };
            if (sum == 1) {
                ans.append("1") ;
                carry = 0 ;
            };
            if (sum == 2) {
                ans.append("0");
                carry =1;
            }
            if (sum== 3){
                ans.append("1");
                carry =1;
            }
            i--;
            j--;

        }
        if (carry ==1) ans.append("1");
        ans.reverse();
        return ans.toString();
    }

    public static String addBinary2(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += s1.charAt(i--) - '0';
            if (j >= 0) sum += s2.charAt(j--) - '0';

            ans.append(sum % 2);
            carry = sum / 2;
        }

        return ans.reverse().toString();
    }

}
