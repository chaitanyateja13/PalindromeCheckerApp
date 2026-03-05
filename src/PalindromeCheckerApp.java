class PalindromeChecker {

    public boolean checkPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

}

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String word = "madam";
        System.out.println(word + (checker.checkPalindrome(word) ? " is a Palindrome" : " is not a Palindrome"));
    }

}