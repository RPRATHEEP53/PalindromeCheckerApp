import java.util.Scanner;

/**
 * *************************************************************
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * *************************************************************
 * * Use Case 10: Normalized Palindrome Validation
 * * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 * * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 * * This ensures the palindrome check is logical rather
 * than character-format dependent.
 * * Example:
 * "A man a plan a canal Panama"
 * * @author Developer
 * @version 10.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // 1. Normalize string:
        // Use RegEx [^a-zA-Z0-9] to remove anything that isn't a letter or number
        // and convert everything to lowercase.
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // 2. Apply previous logic (Compare characters from both ends)
        // Optimization: only loop until the middle of the string
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}