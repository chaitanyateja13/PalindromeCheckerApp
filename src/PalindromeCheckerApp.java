interface PalindromeStrategy {
    boolean check(String word);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for(char c : word.toCharArray()) stack.push(c);
        String rev = "";
        while(!stack.isEmpty()) rev += stack.pop();
        return word.equals(rev);
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for(char c : word.toCharArray()) deque.add(c);
        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "level";
        PalindromeStrategy strategy = new StackStrategy(); // choose dynamically
        System.out.println(word + (strategy.check(word) ? " is a Palindrome" : " is not a Palindrome"));
    }
}