public class PalindromeCheckerApp {

    public static boolean isPalindrome(String s, int start, int end) {
        if(start >= end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "civic";
        boolean result = isPalindrome(word, 0, word.length() - 1);
        System.out.println(word + (result ? " is a Palindrome" : " is not a Palindrome"));
    }

}