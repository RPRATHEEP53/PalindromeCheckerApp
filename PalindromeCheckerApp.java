import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Instantiate the strategy to test (e.g., Stack-based)
        PalindromeStrategy strategy = new StackStrategy();

        // 1. Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // 2. Run the algorithm
        boolean isPalindrome = strategy.check(input);

        // 3. Capture end time in nanoseconds
        long endTime = System.nanoTime();

        // 4. Calculate total execution duration
        long duration = endTime - startTime;

        // Display results
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");

        scanner.close();
    }
}

/**
 * INTERFACE - PalindromeStrategy
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Uses LIFO behavior to reverse characters for comparison.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}