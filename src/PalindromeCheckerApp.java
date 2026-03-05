import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "deed";
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()) deque.add(c);

        boolean isPalindrome = true;
        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(word + (isPalindrome ? " is a Palindrome" : " is not a Palindrome"));

    }

}