import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";

        // Create a Queue (FIFO) and a Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // 1. Enqueue and Push characters
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // 2. Compare dequeue vs pop until the queue is empty
        while (!queue.isEmpty()) {
            // If any pair doesn't match, it's not a palindrome
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Output results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}