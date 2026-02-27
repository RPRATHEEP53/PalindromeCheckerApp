import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Initial call: start index 0, end index length - 1
        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * * @param s      Input string
     * @param start  Starting index
     * @param end    Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition 1: If pointers cross or meet, all characters matched
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If characters at current positions don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: Move inward and check the next pair
        return check(s, start + 1, end - 1);
    }
}