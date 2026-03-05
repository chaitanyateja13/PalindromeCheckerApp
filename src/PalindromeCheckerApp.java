public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";
        char[] arr = word.toCharArray();
        boolean isPalindrome = true;

        int start = 0, end = arr.length - 1;
        while(start < end) {
            if(arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(word + (isPalindrome ? " is a Palindrome" : " is not a Palindrome"));
    }

}