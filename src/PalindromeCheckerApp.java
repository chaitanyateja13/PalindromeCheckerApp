import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

// Strategy interface
interface PalindromeStrategy {
    boolean check(String word);
}

// Encapsulated strategies
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

// Main App
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PALINDROME CHECKER APP - UC14");
        System.out.println("Choose strategy: 1 = Stack, 2 = Deque");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        PalindromeStrategy strategy;
        if (choice == 1) strategy = new PalindromeStrategies.StackStrategy();
        else strategy = new PalindromeStrategies.DequeStrategy();

        System.out.println("Enter strings to check (comma separated):");
        String input = sc.nextLine();
        String[] words = input.split(",");

        for (String w : words) {
            w = w.trim();
            long start = System.nanoTime();
            boolean result = strategy.check(w);
            long end = System.nanoTime();
            System.out.println(w + " -> " + result + " (Time: " + (end-start) + " ns)");
        }

        sc.close();
    }
}