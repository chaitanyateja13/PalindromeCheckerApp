class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "rotor";
        Node head = null;

        for(char c : word.toCharArray()) {
            Node node = new Node(c);
            node.next = head;
            head = node;
        }

        Node curr = head;
        String reversed = "";
        while(curr != null) {
            reversed += curr.data;
            curr = curr.next;
        }

        System.out.println(word + (word.equals(reversed) ? " is a Palindrome" : " is not a Palindrome"));

    }

}