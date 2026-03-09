import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // 1. Define and inject the strategy at runtime
        // Here we choose the Stack-based strategy
        PalindromeStrategy strategy = new StackStrategy();

        // 2. Execute the selected algorithm
        boolean isPalindrome = strategy.check(input);

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    /**
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Provides a Stack-based implementation of the PalindromeStrategy.
 * It uses LIFO behavior to reverse characters and compare them.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        // Popping provides characters in reverse order (LIFO)
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}