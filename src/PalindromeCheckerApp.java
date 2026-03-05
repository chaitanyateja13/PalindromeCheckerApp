public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar";
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println(word + (word.equals(reversed) ? " is a Palindrome" : " is not a Palindrome"));

    }

}