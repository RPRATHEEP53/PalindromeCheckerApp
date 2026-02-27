import java.util.ArrayDeque; // Required for the implementation
import java.util.Deque;      // Required for the interface
public class PalindromeCheckerApp {
    public static void main(String[] args) {
    // Define the input string
    String input = "refer";

    // Create a Deque to store characters
    Deque<Character> deque = new ArrayDeque<>();

    // Add each character to the deque
    for (char c : input.toCharArray()) {
        deque.addLast(c);
    }

    // Flag to track palindrome result
    boolean isPalindrome = true;

    // Continue comparison while more than one element exists
    while (deque.size() > 1) {
        // Remove from both ends and compare
        if (!deque.removeFirst().equals(deque.removeLast())) {
            isPalindrome = false;
            break;
        }
    }

    // Output results
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}
}
