import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "noon";
        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()) stack.push(c);

        String reversed = "";
        while(!stack.isEmpty()) reversed += stack.pop();

        System.out.println(word + (word.equals(reversed) ? " is a Palindrome" : " is not a Palindrome"));

    }

}