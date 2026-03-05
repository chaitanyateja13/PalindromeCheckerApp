import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Strategy interface
interface PalindromeStrategy {
    boolean check(String word);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);

        String reversed = "";
        while (!stack.isEmpty()) reversed += stack.pop();

        return word.equals(reversed);
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : word.toCharArray()) deque.add(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// Main application
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "abccbaabccba";

        long start = System.nanoTime();
        boolean stackResult = new StackStrategy().check(word);
        long end = System.nanoTime();
        System.out.println("Stack: " + stackResult + " Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean dequeResult = new DequeStrategy().check(word);
        end = System.nanoTime();
        System.out.println("Deque: " + dequeResult + " Time: " + (end - start) + " ns");
    }
}