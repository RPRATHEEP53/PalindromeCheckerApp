public class PalindromeCheckerApp {


    public static void main(String[] args) {
        // Step 1: Store a predefined string
        String input = "madam" +
                "";
        boolean isPalindrome = true;


        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character at index i with its mirrored character from the end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }

        // Step 3: Determine and display the result on the console
        System.out.println("Input String: " + input);
        System.out.println("is it a Palindrome? : " + isPalindrome);
    }
}
