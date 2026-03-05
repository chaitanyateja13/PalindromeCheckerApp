import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Strategy interface
interface PalindromeStrategy {
    boolean check(String word);
}

// All strategies encapsulated
class PalindromeStrategies {

    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String word) {
            Stack<Character> stack = new Stack<>();
            for (char c : word.toCharArray()) stack.push(c);
            String reversed = "";
            while (!stack.isEmpty()) reversed += stack.pop();
            return word.equals(reversed);
        }
    }

    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String word) {
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : word.toCharArray()) deque.add(c);
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) return false;
            }
            return true;
        }
    }
}

// Main application
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "level";

        PalindromeStrategy strategy1 = new PalindromeStrategies.StackStrategy();
        System.out.println("StackStrategy: " + word + " -> " + strategy1.check(word));

        PalindromeStrategy strategy2 = new PalindromeStrategies.DequeStrategy();
        System.out.println("DequeStrategy: " + word + " -> " + strategy2.check(word));
    }
}