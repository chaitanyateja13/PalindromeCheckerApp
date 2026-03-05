public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   PALINDROME CHECKER APP");
        System.out.println("   Version 1.0");
        System.out.println("=================================");

        String word = "madam";

        if(word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}