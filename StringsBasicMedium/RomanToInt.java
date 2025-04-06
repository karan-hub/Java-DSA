package StringsBasicMedium;

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt converter = new RomanToInt();
        String romanNumeral = "MCMXCIV";
        int result = converter.romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + result);

    }

    public int romanToInt(String s) {
        int len = s.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            if (i < len && getValue(s.charAt(i)) < getValue(s.charAt(i + 1)))
                ans = ans - getValue(s.charAt(i));
            else
                ans = ans + getValue(s.charAt(i));
        }
        return ans;
    }

    public int getValue(char ch) {
        int result = switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
        return result;
    }
}
