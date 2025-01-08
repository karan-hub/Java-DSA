package BasicMaths;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int number = 121; // Example number
        boolean result = palindromeNumber.isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
    }

    public boolean isPalindrome(int x) {
        int original = x;
        int reverserd = 0;
        while(x > 0){
            int digit = x % 10;
            x/=10 ;
            reverserd = reverserd *10 + digit;
            
        }
        if (reverserd == original) {
            return true;
        }
        return false;

    }
}
